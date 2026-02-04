# Last updated: 04/02/2026, 22:44:22
class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        return num == 0 or num % 10 != 0