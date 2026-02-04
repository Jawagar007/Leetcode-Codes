# Last updated: 04/02/2026, 22:44:04
class Solution:
    def minimumOperations(self, nums):
        operations = 0
        for num in nums:
            if num % 3 != 0:
                operations += 1
        return operations