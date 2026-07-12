class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l = 0
        r =  len(nums)-1
        first = -1
        last = -1
        while l <= r:
            if nums[l] == target and nums[r] == target:
                first = l
                last = r
                break
            if target > nums[l]:
                l += 1
            if target < nums[r]:
                r -= 1
        return [first, last]

            


            


            

        