# Last updated: 04/02/2026, 22:44:39
import math
class Solution:
    def arrangeCoins(self, n: int) -> int:
        return int((math.sqrt(1 + 8 * n) - 1) // 2)