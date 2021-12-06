#include<bits/stdc++.h>
using namespace std;

void calculateTime (int n) 
{
  if (n == 0)
    cout << "Time Estimated : 0 Minutes";
  
  else if (n > 0 && n <= 2000)
    cout << "Time Estimated : 25 Minutes";
  
  else if (n > 2000 && n <= 4000)
    cout << "Time Estimated : 35 Minutes";
  
  else if (n > 4000 && n <= 7000)
    cout << "Time Estimated : 45 Minutes";
  
  else
    cout << "INVALID INPUT";
}

int main () 
{
  int Weight;
  cin >> Weight;
  
  calculateTime (Weight);
  return 0;

}
