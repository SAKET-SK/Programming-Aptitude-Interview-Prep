#include<bits/stdc++.h> 
using namespace std; 

 // } Driver Code Ends
class Solution
{
public:
    vector<int> threeDivisors(vector<long long> query, int q)
    {
        vector<int>sieve(10000001, 1);
        sieve[0] = sieve[1] = 0;
        for(int i=2; i< 10000001; i++){
            if(sieve[i]){
                for(int j = 2*i; j< 10000001; j += i){
                    sieve[j] = 0;
                }
            }
        }
        for(int i=1; i< 10000001; i++){
            sieve[i] += sieve[i-1];
        }
        vector<int> ans;
        for(int i= 0; i< q; i++){
            int p = floor(sqrt(query[i]));
            ans.push_back(sieve[p]);
        }
        return ans;
    }
};

// { Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while(t--){
        int q;cin>>q;
        vector<long long> query(q);
        for(int i=0;i<q;i++){
            cin>>query[i];
        }
        Solution ob;
            
        vector<int> ans = ob.threeDivisors(query,q);
        for(auto cnt : ans) {
            cout<< cnt << endl;
        }
    }
    return 0;
}  // } Driver Code Ends
