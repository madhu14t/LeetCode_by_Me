class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                sum += num;
            }
        }
        
        return sum;
    }
}
