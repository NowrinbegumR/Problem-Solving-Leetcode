class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        se = s.split()
        last = se[-1]
        return len(last)
        
        
            

        