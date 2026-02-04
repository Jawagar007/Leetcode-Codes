# Last updated: 04/02/2026, 22:44:10
class Solution:
    def findDelayedArrivalTime(self, arrivalTime: int, delayedTime: int) -> int:
        # Add arrivalTime and delayedTime, then wrap around using modulo 24
        return (arrivalTime + delayedTime) % 24        