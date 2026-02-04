# Last updated: 04/02/2026, 22:44:05
class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        total = n * (n + 1) // 2
        k = n // m
        sumDivisible = m * k * (k + 1) // 2
        return total - 2 * sumDivisible