#include<bits/stdc++.h>
using namespace std;

void ceaser(string s, int key) 
{
    if(key==0)
    {
        printf("INVALID INPUT");
    }
    else
    {
        for(int i=0; i<s.size(); i++){
            
        if(isdigit(s[i]))
            {
                if(s[i]+key<=57)
                {
                    s[i] = s[i] + key;
                }
                else
                {
                   int left = (s[i] + key) - 57;
                    s[i] = 47 + left;
                }   
            }
            else if(s[i]>=65 && s[i]<=90)
            {
                if(s[i]+key<=90)
                {
                    s[i] = s[i] + key;
                }
                else
                {
                    int left = (s[i] + key) - 90;
                    s[i] = 64 + left;
                }  
            }
            else if(s[i]>=97 && s[i]<=122)
            {
                if(s[i]+key<=122)
                {
                    s[i] = s[i] + key;
                }
                else
                {
                    int left = (s[i] + key) - 122;
                    s[i] = 96 + left;
                } 
            }
            
        }
    }
    cout <<"The Encrypted Text is:"<<s;
}

int main () 
{
  string s;
  int key;
  
  cout<<"Enter the plain text :";
  getline(cin, s);
  
  cout<<"\nEnter the key :";
  cin>>key;
  
  
  ceaser(s, key);
  return 0;

}
