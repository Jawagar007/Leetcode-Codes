# Last updated: 04/02/2026, 22:44:29
class Solution:
    def countOdds(self, low: int, high: int) -> int:
        return ((high + 1) // 2) - (low // 2)