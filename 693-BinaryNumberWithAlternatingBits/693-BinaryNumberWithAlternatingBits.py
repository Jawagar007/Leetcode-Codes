# Last updated: 04/02/2026, 22:44:35
class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        xor_val = n ^ (n >> 1)
        return (xor_val & (xor_val + 1)) == 0
sol = Solution()
print(sol.hasAlternatingBits(5))   
print(sol.hasAlternatingBits(7))  
print(sol.hasAlternatingBits(11))  