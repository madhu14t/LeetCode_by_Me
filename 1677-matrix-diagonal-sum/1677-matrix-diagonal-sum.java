class Solution {
    public int diagonalSum(int[][] mat) {
        int sum;
        int n=mat.length;
        sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
            if(i!=n-i-1){
                sum+=mat[i][n-i-1];
            }
        }return sum;
        
    }
}