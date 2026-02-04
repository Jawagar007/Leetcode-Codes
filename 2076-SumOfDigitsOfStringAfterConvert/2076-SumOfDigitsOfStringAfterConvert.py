# Last updated: 04/02/2026, 22:44:25
class Solution:
    def getLucky(self, s: str, k: int) -> int:
        num_str = "".join(str(ord(ch) - ord('a') + 1) for ch in s)
        total = sum(int(digit) for digit in num_str)
        for _ in range(k - 1):
            total = sum(int(digit) for digit in str(total)) 
        return total