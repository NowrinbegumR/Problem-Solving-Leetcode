class Solution:
    def reverse(self, x: int) -> int:
        res = 0
        neg=0
        if x<0:
            neg = 1
            x = abs(x)
        while x > 0:
            rem = x % 10
            res = res * 10 +  rem
            x = x // 10
        if res< 2**31 and res>-2**31:
            if neg==1:
                return -res
            else:
                return res
        else:
            return 0