class Solution {
    public int[] sumZero(int n) {
        int i;
        int[] arr= new int[n];
        if(n%2 != 0){
            arr[n-1] = 0;
        }
        for(i=0;i<n-1;i=i+2){
            arr[i] = 1+i;
            arr[i+1] = -(i+1);
        }
        return arr;
    }
}