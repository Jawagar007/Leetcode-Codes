# Last updated: 04/02/2026, 22:44:20
class Solution:
    def smallestEvenMultiple(self, n: int) -> int:
        # If n is even, return n; otherwise return 2*n
        return n if n % 2 == 0 else 2 * n