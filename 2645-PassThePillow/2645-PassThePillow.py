# Last updated: 04/02/2026, 22:44:14
class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        cycle = n - 1
        flips = time // cycle
        offset = time % cycle
        if flips % 2 == 0:
            return 1 + offset
        else:
            return n - offset