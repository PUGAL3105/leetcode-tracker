// Last updated: 25/07/2026, 09:15:13
1class Solution {
2    public int maxProduct(int n) {
3        int s=0;
4        int d=0;
5        while(n>0){
6            int r=n%10;
7            if(r>=s){
8                d=s;
9                s=r;
10                
11            }
12            else if(r>d){
13                d=r;
14
15            }
16            n=n/10;
17        }
18        return s*d;
19    }
20}