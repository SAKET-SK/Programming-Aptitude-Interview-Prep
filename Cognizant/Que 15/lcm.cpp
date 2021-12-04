#include<iostream>
using namespace std;
int HCF(int, int);
int LCM(int, int);

int main() {
               int num1, num2, result;
               cin>>num1;
               cin>>num2;
               result = LCM ( num1, num2 );
               cout<< result;
               return 0;
}

// This function find the Highest Common Factor of the two numbers
int HCF (int num1, int num2) {
               if (num2 == 0)
                        return num1;
               return HCF(num2, num1 % num2);
}

// This function find the Lowest Common Factor of the two numbers
int LCM (int num1, int num2) {
               return (num1 * num2) / HCF(num1, num2);
}
