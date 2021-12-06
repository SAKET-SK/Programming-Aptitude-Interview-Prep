#include <bits/stdc++.h>
using namespace std;

int main()
{
    string c[3]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};

    string t[8]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};

    string s[4]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};

    string b[3]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
    
    
    char ch;
    int n;
    
    string res = "";
    
    cin>>ch>>n;
    
    if(ch=='c' and n <= 3)
     res = c[n-1];
    
    else if(ch=='t' and n <= 8)
     res = t[n-1];
     
    else if(ch=='s' and n <= 4)
     res = s[n-1];
    
    else if(ch=='b' and n <= 3)
     res = b[n-1];
     
    else res = "Invalid Input";
    
    if(res != "Invalid Input" )
     cout<<"Welcome to CCD!\nEnjoy your "<<res;
    
    else cout<<res;
    
    return 0;
}
