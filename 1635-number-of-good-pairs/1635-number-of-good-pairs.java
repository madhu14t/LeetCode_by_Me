class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n))
            {
                count+=map.get(n);
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
    return count;
    }
}