# Last updated: 04/02/2026, 22:44:56
class Solution:
    def singleNumber(self, nums):
        result = 0
        for num in nums:
            result ^= num
        return result
