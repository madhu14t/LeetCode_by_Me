class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        s=0
        for i in range(len(nums)):
            s+=nums[i]
        s/=2
        s1=0
        for i in range(len(nums)):
            s1+=nums[i]/2
            # print('hai',s1)
            # if(nums[i]%2==0):
            if(s==s1):
                return i
            s1+=nums[i]/2
            # else:
            #     if(s1==s):
            #         # print('hi')
            #         return i
            #     s1+=(nums[i]/2)
            print(s1)
        return -1
