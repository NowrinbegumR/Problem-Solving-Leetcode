class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        count = 0
        temp = []
        for i in range(len(nums)):
            count += nums[i]
            temp.append(count)
        return temp


        