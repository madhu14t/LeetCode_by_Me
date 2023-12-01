class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] res=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int n=image.length;
            int idx=0;
             for(int j=n-1;j>=0;j--){
                res[i][idx++]=image[i][j];
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                if(res[i][j]==0){
                    res[i][j]=1;
                }
                else{
                    res[i][j]=0;
                }
            }
        }
        return res;
    }
}