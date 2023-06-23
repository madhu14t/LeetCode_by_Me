class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        s=0
        for i in range(len(nums)):
            s+=nums[i]
        s/=2
        s1=0
        for i in range(len(nums)):
            s1+=nums[i]/2
            if(s==s1):
                return i
            s1+=nums[i]/2
            print(s1)
        return -1
