class Solution {
    public int[] replaceElements(int[] arr) {
    int max=-1;
        int n=arr.length;
        int[] nums=new int[n];
        for(int i=n-1;i>=0;i--){
            nums[i]=max;
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return nums;
    }
}