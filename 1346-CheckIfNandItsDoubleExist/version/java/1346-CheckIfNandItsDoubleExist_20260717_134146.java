// Last updated: 17/07/2026, 13:41:46
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=0;j<arr.length;j++){
5                if(arr[i]==2*arr[j] && i !=j){
6                    return true;
7                }
8            }
9          
10        }
11          return false;
12    }
13}