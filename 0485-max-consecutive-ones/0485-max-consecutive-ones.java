class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        return maxCount;
    }
}