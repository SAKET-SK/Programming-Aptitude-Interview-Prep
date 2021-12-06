#include<iostream>
using namespace std;

int main ()
{
  
  int n;
  cin >> n;
  
  if (n % 2 == 1)
    {
      int a = 1;
      int r = 2;
      
      int term_in_series = (n + 1) / 2;
      
      int res = 2 * (term_in_series-1);
      cout << res;
    }
  
  else
    {
      int a = 1;
      int r = 3;
      int term_in_series = n / 2;
      
      int res = term_in_series-1;
      cout << res;
    } 
 
return 0;

}
