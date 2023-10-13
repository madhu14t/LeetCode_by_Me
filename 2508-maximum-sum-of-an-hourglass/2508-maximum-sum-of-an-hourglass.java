class Solution {
    public int maxSum(int[][] grid) {
        int res=0,sum=0;
        for(int r=0;r<grid.length-2;r++){
            for(int c=0;c<grid[0].length-2;c++){
                sum+=grid[r][c]+grid[r][c+1]+grid[r][c+2]+
                    grid[r+1][c+1]+
                    grid[r+2][c]+grid[r+2][c+1]+grid[r+2][c+2];
                res=Math.max(res,sum);
                sum=0;
            }
        }
        return res;
    }
}