# Last updated: 04/02/2026, 22:44:07
class Solution:
    def distanceTraveled(self, mainTank: int, additionalTank: int) -> int:
        distance = 0
        
        while mainTank >= 5:
            mainTank -= 5
            distance += 50
            
            if additionalTank > 0:
                mainTank += 1
                additionalTank -= 1
        
        distance += mainTank * 10
        return distance