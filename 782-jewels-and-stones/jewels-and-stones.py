class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        cnt = 0
        for char in stones:
            if char in jewels:
                cnt += 1
        return cnt


       

        