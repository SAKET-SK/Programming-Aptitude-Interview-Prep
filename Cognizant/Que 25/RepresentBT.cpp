#include <bits/stdc++.h>
using namespace std;
string s, ans = "";
unordered_map < char, int >root, child, flag;	//rootOf,childOf
map < pair < char, char >, int >duplicateedgecheck;	//Duplicate edge check
unordered_map < char, char >par, ch[2], monitor;
char
find (char c)
{
  if (monitor[c])
    return monitor[c];
  if (root[c] == 0)
    return monitor[c] = c;
  return monitor[c] = find (par[c]);
}

void
makeans (char c)
{
  if (flag[c] == 0)
    {
      ans += c;
      flag[c]++;
      if (child[c] == 2)
	{
	  ans += '(';
	  makeans (min (ch[0][c], ch[1][c]));
	  ans += '(';
	  makeans (max (ch[0][c], ch[1][c]));
	}
      else
	for (int i = 0; i < child[c]; i++)
	  {
	    ans += '(';
	    makeans (ch[i][c]);
	  }
      ans += ')';
    }
}

int
main ()
{
  getline (cin, s);
  for (int i = 0; i < 26; i++)
    {
      root['A' + i] = -5;
    }
  for (int i = 0; i < s.length (); i++)
    if (s[i] == '(')
      {
	child[s[i + 1]]++;
	root[s[i + 3]] = root[s[i + 3]] == -5 ? 1 : root[s[i + 3]]++;
	duplicateedgecheck[
			    {
			    min (s[i + 1], s[i + 3]), max (s[i + 1], s[i + 3])}
	]++;
	root[s[i + 1]] == -5 ? root[s[i + 1]] = 0 : 1;
	ch[0][s[i + 1]] == '\0' ? ch[0][s[i + 1]] =
	  s[i + 3] : ch[1][s[i + 1]] = s[i + 3];
	par[s[i + 3]] = s[i + 1];
	if (child[s[i + 1]] > 2)
	  {
	    cout << "Code Stopped1";
	    return 0;
	  }
	if (duplicateedgecheck[
				{
				min (s[i + 1], s[i + 3]), max (s[i + 1],
							       s[i + 3])}
	    ] > 1)
	  {
	    cout << "Code Stopped2";
	    return 0;
	  }
	if (find (s[i + 1]) == find (s[i + 3]) && s[i + 1] != par[s[i + 3]])
	  {
	    cout << "Code Stopped3";
	    return 0;
	  }
	if (root[s[i + 3]] > 1)
	  {
	    cout << "Code Stopped4";
	    return 0;
	  }
	if (s[i + 4] != ')' || s[i + 2] != ',')
	  {
	    cout << "Code Stopped5";
	    return 0;
	  }
	//i+=5;
      }
  for (int i = 0; i < 26; i++)
    {
      if (root['A' + i] == 0)
	makeans ('A' + i);
    }
  cout << ans;
}
