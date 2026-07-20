// Last updated: 20/07/2026, 12:16:01
1class Solution {
2    public int findLHS(int[] nums) {
3        // 1. Calculating the frequency of occurrence of numbers
4        // Creating a Map to know how many times each number occurs.
5        Map<Integer, Integer> frequencyMap = new HashMap<>();
6
7        // We go through all the numbers in the nums array... 🚶‍♀️
8        for (int num : nums) {
9            // ...and for each number num, we update its counter in frequencyMap. ⬆️
10            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
11            // (If the number is not in the card yet, start counting from zero.) 0️⃣
12        }
13
14        // 2. The search for the maximum harmonious subsequence
15        // We start with a maximum length of 0. in
16int maxLength = 0;
17
18        // Going through all the unique numbers in our frequencyMap map... 🗺️
19        for (int num : frequencyMap.keySet()) {
20// ...and check if there is a number in the map that is 1 higher than the current one. 🤔
21            if (frequencyMap.containsKey(num + 1)) {
22                // If we found the number + 1, it means that we have a "harmonious pair"! 👯‍♂️
23
24                // We calculate the total length of this pair by adding their frequencies. ➕
25                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
26
27                // Update the maximum length if this pair is steeper than the previous ones. 🏆
28                maxLength = Math.max(maxLength, currentLength);
29            }
30        }
31
32        // 3. We return the result! 🎉
33        return maxLength;
34    }
35}