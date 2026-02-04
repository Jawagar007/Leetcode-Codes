# Last updated: 04/02/2026, 22:45:00
class Solution:
    def reverse(self, x: int) -> int:
        rev = 0
        sign = 1 if x >= 0 else -1
        x = abs(x)
        
        while x != 0:
            digit = x % 10
            x //= 10
            
            if rev > (2**31 - 1) // 10:
                return 0
            
            rev = rev * 10 + digit
        
        rev *= sign
        return rev if -2**31 <= rev <= 2**31 - 1 else 0