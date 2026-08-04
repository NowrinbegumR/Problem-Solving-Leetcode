class Solution:
    def addDigits(self, num: int) -> int:
        if num < 10:
            return num
        res = 0
        while num > 0:
            rem = num % 10
            res += rem
            num //= 10
        return self.addDigits(res)