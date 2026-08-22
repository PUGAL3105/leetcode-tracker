// Last updated: 22/08/2026, 09:01:53
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int m=n;
4        int s=0;
5        int p=1;
6        while(n>0){
7            int d=n%10;
8            s +=d;
9            p =p*d;
10            n=n/10;
11            
12        }
13        int f=s+p;
14        if(m % f==0)
15        return true;
16        else
17        return false;
18        
19    }
20}