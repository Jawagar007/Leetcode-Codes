# Last updated: 04/02/2026, 22:44:02
class Solution:
    def accountBalanceAfterPurchase(self, purchaseAmount: int) -> int:
        roundedAmount = ((purchaseAmount + 5) // 10) * 10
        return 100 - roundedAmount