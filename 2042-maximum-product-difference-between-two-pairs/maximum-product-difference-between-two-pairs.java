class Solution {
    public int maxProductDifference(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int a=nums[0]*nums[1];
        int b=nums[len-2]*nums[len-1];
        return Math.abs(a-b);
    }
}