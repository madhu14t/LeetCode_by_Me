class Solution {
    public int findGCD(int[] nums) {
      Arrays.sort(nums);
      int x=nums[0];
      int y=nums[nums.length-1];
      int large=x;
      for(int i=1;i<=y;i++){
          if(x%i==0 && y%i==0){
              large=i;
              }
          }
      return large;
    }
}