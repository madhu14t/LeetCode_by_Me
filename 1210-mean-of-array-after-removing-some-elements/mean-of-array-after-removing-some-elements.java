class Solution {
    public double trimMean(int[] arr) {
        double len=arr.length*0.05;
        Arrays.sort(arr);
        double sum=0;
        double j=0;
        for(int i=(int)len;i<arr.length-len;i++){
            sum+=arr[i];
            j++;
        }
        double mean=sum/j;
        return mean;
    }
}