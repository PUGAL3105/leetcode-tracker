// Last updated: 09/07/2026, 09:48:21
class Solution {
    public int[][] transpose(int[][] matrix) {
       int r=matrix.length;
       int c= matrix[0].length;
       int a[][]=new int[c][r];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[j][i]=matrix[i][j];
        }
       } 
       return a;
    }
}