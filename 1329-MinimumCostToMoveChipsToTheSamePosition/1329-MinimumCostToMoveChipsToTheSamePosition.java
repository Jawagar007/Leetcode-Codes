// Last updated: 04/02/2026, 22:44:30
class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;

        for (int p : position) {
            if (p % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return Math.min(oddCount, evenCount);
    }
}