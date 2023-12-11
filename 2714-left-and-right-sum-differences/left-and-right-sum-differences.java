class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum=sum+nums[i];
            left[i+1]=sum;
        }
        sum=0;
        for(int i=n-1;i>0;i--)
        {
            sum=sum+nums[i];
            right[i-1]=sum;
        }
        for(int i=0;i<n;i++)
            ans[i]=Math.abs(left[i]-right[i]);
        return ans;
    }
}