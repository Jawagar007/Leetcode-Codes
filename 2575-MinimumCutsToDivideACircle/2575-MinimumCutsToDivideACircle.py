# Last updated: 04/02/2026, 22:44:17
class Solution:
    def numberOfCuts(self, n: int):
        if n == 1:
            return 0
        elif n % 2 == 0:
            return n // 2
        else:
            return n