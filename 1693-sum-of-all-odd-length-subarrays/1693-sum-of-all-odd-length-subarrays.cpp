class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
         int ans=0,l=arr.size();
        for(int i=0;i<l;i++ ){
            int sum=0,len=0;
            for(int j=i;j<l;j++){
                len++;
                sum+=arr[j];
                if(len%2==1) ans+=sum;
            }
        }
        return ans;
    }
};