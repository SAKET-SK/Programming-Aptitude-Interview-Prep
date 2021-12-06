#include <bits/stdc++.h>
using namespace std;
int main() {
string s , d;
 cin>>s>>d;
 transform(s.begin(),s.end() , s.begin(),::toupper);
 transform(d.begin(),d.end() , d.begin(),::toupper);
 string arrs[8] = {"TH" , "GA", "IC" , "HA" , "TE", "LU" ,"NI","CA"};
 float arr[8]={800,600,750,900,1400,1200,1100,1500};
 float res=0;
 int st ,ed;
 for(int i=0;i<8;i++)
 {
     if(s==arrs[i])
     st=i;
     
     if(d==arrs[i])
     ed=i;
  }
  if(st==ed)
  {
      cout<<" INVALID INPUT";
      return 0;
  }
  else
  {
      int i=st+1;
      cout<<i;
        while(i!=ed+1)
        {
            res+=(arr[i]);
            i=(i+1)%8;
        }
        cout<<(ceil)(res*0.005);
        return 0;
 }
}
