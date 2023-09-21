class Solution {
    public void duplicateZeros(int[] arr) {
        int a[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j==arr.length)break;
            if(arr[i]==0){
                a[j++]=0;
                 if(j==arr.length)break;
                a[j++]=0;
            }
            else{
                a[j++]=arr[i];
            }
            
        }
        
        j=0;
        for(int ele:a){
            arr[j++]=ele;
        }
        
    }
}