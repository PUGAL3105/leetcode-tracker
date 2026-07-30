// Last updated: 30/07/2026, 08:51:44
1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int b=n/8;
5        return (b*(b+1)*4)+(n%8)*(b+1);
6    }
7}