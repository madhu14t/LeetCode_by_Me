class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (hash_map.containsKey(nums[i])){
                if(hash_map.get(nums[i])==1)
                 {
                return true;
                }
            }
            else{
                   hash_map.put(nums[i],1);
                }
        }
        return false;
    }
}