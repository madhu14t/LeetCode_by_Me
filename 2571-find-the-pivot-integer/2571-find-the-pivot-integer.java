class Solution {
    public int pivotInteger(int n) {
        int t_sum=n*(n+1)/2;
        int cur_sum=0;
        for(int i=1;i<=n;i++){
            cur_sum+=i;
            if(cur_sum==t_sum-cur_sum+i){
                return i;
            }
        }
        return -1;
    }
}