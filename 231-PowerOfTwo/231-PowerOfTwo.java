// Last updated: 09/07/2026, 09:50:34
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        return (n%2==0) && isPowerOfTwo(n/2);
    }
}