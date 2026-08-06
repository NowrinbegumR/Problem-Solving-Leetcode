class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        while True:
            temp = n
            pdt = 1
            while temp > 0:
                digit = temp % 10
                pdt *= digit
                temp //= 10
            if pdt % t == 0:
                return n
            n += 1

        