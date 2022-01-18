Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.

Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term.
Example 2:

Input: A = 4, R = 3, N = 3
Output: 36
Explanation: The GP series is
4, 12, 36, 108,.. in which 36 is
the 3rd term.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function Nth_term() which takes A, R and N as input parameter ans returns Nth term of the GP series modulo 109 + 7.
 

Expected Time Complexity: O(log2(N))
Expected Space Complexity: O(1)

Constraints:
1 <= A, R, N <= 1000000
