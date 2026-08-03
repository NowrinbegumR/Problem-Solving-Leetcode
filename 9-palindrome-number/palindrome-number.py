class Solution:
    def isPalindrome(self, x: int) -> bool:
        orginal = x
        res = 0
        while x > 0:
            rem = x % 10
            res = res * 10 + rem
            x //= 10
        if orginal == res:
           return True
        else:
            return False
        