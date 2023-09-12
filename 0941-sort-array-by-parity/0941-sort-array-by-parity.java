class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int[] a=new int[nums.length];
       int x=0;
       int y=nums.length-1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
               a[x++]=nums[i];
           }
           else{
               a[y--]=nums[i];
           }
       }
       return a;
        
    }
}