#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x, count =0, flag = 0, fee_sum=0;
    
    while(cin>>x){
        
        if(x<=0 and x>120)
        {
            flag=1;
            break;
        }
        
        count++;
        
        if(x<17) fee_sum +=200;
        
        else if(x>=17 and x<=40) fee_sum += 400;
        
        else fee_sum += 300;
    }
    
    if(count >20 and flag != 1)
    cout<<"INVALID INPUT";
    
    else cout<<"Total income : "<<fee_sum<<" INR";
    return 0;
}
