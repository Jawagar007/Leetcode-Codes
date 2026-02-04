# Last updated: 04/02/2026, 22:44:36
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1:
            return False

        total = 1   # <-- make sure this is aligned with 'if'
        i = 2
        while i * i <= num:
            if num % i == 0:
                total += i
                if i != num // i:
                    total += num // i
            i += 1

        return total == num