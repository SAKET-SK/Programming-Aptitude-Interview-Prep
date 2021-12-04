#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int n, i;
    cout << "Enter the positive integer: ";
    cin >> n;

    if(n == 0) {
            cout << "No Factors";
            return false;
            }
            if(n < 0) {
                        n = abs( n );
            }
    cout << "Factors of " << n << " are: " << endl; 
    for(i = 1; i <= n; ++i) {
        if(n % i == 0) {
            cout << i << endl;    
                        }
    }
    return 0;
}
