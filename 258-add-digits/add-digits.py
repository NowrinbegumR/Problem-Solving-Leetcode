class Solution:
    def addDigits(self, num: int) -> int:
        if(num <= 9):
            return num
        else:
           res = 1 + (num - 1) % 9
           return res
        