# Last updated: 04/02/2026, 22:44:52
class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            n &= (n - 1)   # clear lowest set bit
            count += 1
        return count
        