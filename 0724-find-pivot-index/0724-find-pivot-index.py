class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        # for i in range(0,len(nums)):
        #     l1=nums[0:i]
        #     l2=nums[i+1:len(nums)]
        #     # print(l1)
        #     # print(l2)
        #     s1=0
        #     s2=0
        #     for j in range(len(l1)):
        #         s1+=l1[j]
        #     for j in range(len(l2)):
        #         s2+=l2[j]
        #     if(s1==s2):
        #         print(l1)
        #         print(l2)
        #         return i
        # return -1
        s=0
        for i in range(len(nums)):
            s+=nums[i]
        s/=2
        s1=0
        for i in range(len(nums)):
            s1+=nums[i]/2
            # print('hai',s1)
            if(nums[i]%2==0):
                if(s==s1):
                    return i
                s1+=nums[i]/2
            else:
                if(s1==s):
                    # print('hi')
                    return i
                s1+=(nums[i]/2)
            print(s1)
        return -1
