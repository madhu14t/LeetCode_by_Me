class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        int r=mat.length;
        int c=mat[0].length;

        int[] m=new int[r];
        int[] n=new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i]+=mat[i][j];
                n[j]+=mat[i][j];
            }
        }
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                        if(mat[i][j] == 1 && m[i]==1 && n[j]==1){
                                count++;
                        }
            }
         }
        return count;
    }
} 