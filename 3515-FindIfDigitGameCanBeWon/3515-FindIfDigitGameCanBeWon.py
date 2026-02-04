# Last updated: 04/02/2026, 22:44:01
class Solution:
    def canAliceWin(self, nums):
        total = sum(nums)
        single_sum = sum(x for x in nums if x < 10)
        double_sum = sum(x for x in nums if 10 <= x <= 99)
        
        return single_sum > total - single_sum or double_sum > total - double_sum
        