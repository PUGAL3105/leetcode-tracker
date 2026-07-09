// Last updated: 09/07/2026, 09:50:12
class Solution {
    public void reverseString(char[] s) {
       int left=0,right=s.length-1;
while(left<right){
char temp=s[left];
s[left]=s[right];
s[right]=temp;
left++;
right--;
}
    }
}