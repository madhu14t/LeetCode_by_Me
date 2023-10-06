class Solution {
    public int[] buildArray(int[] nums) {
        int x=nums.length;
        int[] ans=new int[x];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}