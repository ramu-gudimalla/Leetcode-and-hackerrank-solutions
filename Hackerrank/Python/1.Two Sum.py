class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lis=[]
        s=dict()
        for i in range(len(nums)):
            x=target-nums[i]
            if x not in s:
                s.update({nums[i]:i})
            else:
                lis.append(i)
                lis.append(nums.index(x))
        return lis