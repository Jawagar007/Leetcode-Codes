# Last updated: 04/02/2026, 22:44:53
class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0
        for i in range(32):
            bit = n & 1
            result = (result << 1) | bit
            n >>= 1
        return result