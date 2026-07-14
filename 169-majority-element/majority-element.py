class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        seens = {}
        n = len(nums)
        for i in range(0,n):
            if nums[i] in seens:
                seens[nums[i]] += 1
            else:
                seens[nums[i]] = 1
            if seens[nums[i]] > n // 2:
                return nums[i]
        