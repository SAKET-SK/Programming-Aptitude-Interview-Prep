// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution
{
    public:
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static bool secc(const pair<int ,int>&a , const pair<int,int>&b){
        return a.second < b.second ; 
    }
    int maxMeetings(int start[], int end[], int n)
    {
        // Your code here
        vector<pair<int,int>>vp ;  
        for(int i=0;i<n;++i){
            vp.push_back({start[i],end[i]})  ; 
        }
        
        sort(vp.begin(),vp.end(),secc)  ; 
        
        int total = 0 ; 
        int p = 0  ; 
        
        for(int i=1;i<n;i++){
            if(vp[p].second >= vp[i].first){
                continue;  
            }
            else{
                total++ ; 
                p = i  ; 
            }
        }
        return total+1 ; 
        
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int start[n], end[n];
        for (int i = 0; i < n; i++) cin >> start[i];

        for (int i = 0; i < n; i++) cin >> end[i];

        Solution ob;
        int ans = ob.maxMeetings(start, end, n);
        cout << ans << endl;
    }
    return 0;
}  // } Driver Code Ends
