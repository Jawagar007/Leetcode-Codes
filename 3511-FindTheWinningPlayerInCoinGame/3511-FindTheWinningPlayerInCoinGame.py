# Last updated: 04/02/2026, 22:44:06
class Solution:
    def winningPlayer(self, x: int, y: int) -> str:
        turns = min(x, y // 4)
        return "Alice" if turns % 2 == 1 else "Bob"