// Last updated: 09/07/2026, 09:48:08
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n =arr.length;
        if(n<3){
            return false;
        }
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
}