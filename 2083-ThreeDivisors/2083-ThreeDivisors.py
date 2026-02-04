# Last updated: 04/02/2026, 22:44:24
class Solution:
  import math

class Solution:
    def isThree(self, n: int) -> bool:
        root = int(math.sqrt(n))
        if root * root != n:  # not a perfect square
            return False
        
        # check if root is prime
        if root < 2:
            return False
        for i in range(2, int(math.sqrt(root)) + 1):
            if root % i == 0:
                return False
        return True