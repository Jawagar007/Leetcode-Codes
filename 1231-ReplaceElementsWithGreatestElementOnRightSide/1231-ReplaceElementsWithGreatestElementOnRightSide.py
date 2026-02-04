# Last updated: 04/02/2026, 22:44:32
class Solution:
    def replaceElements(self, arr):
        max_right = -1
        
        for i in range(len(arr) - 1, -1, -1):
            new_val = max_right
            max_right = max(max_right, arr[i])
            arr[i] = new_val
        
        return arr
