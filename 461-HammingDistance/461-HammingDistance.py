# Last updated: 04/02/2026, 22:44:38
class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor_val = x ^ y
        return bin(xor_val).count('1')
sol = Solution()
print(sol.hammingDistance(1, 4)) 
print(sol.hammingDistance(3, 1))  