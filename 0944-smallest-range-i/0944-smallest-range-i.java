class Solution {
    public int smallestRangeI(int[] nums, int k) {
           Arrays.sort(nums);
    if(nums.length==1)
        return 0;
    
    int a=nums[0]+k;
    int b=nums[nums.length-1]-k;
    
    int ans = b-a;
    if(ans<0)
        ans=0;
    return ans;
    }
}