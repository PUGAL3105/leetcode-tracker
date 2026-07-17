// Last updated: 17/07/2026, 13:37:14
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int max=-1;
4        for(int i=arr.length-1;i>=0;i--){
5            if(arr[i]>max){
6                int temp=max;
7                max=arr[i];
8                arr[i]=temp;
9            }
10            else
11                arr[i]=max;
12        }
13        return arr;
14    }
15}