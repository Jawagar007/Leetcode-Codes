// Last updated: 20/07/2026, 12:07:28
1class Solution {
2
3    public int reversePairs(int[] nums) {
4        return mergeSort(nums, 0, nums.length - 1);
5    }
6
7    private int mergeSort(int[] nums, int low, int high) {
8
9        if (low >= high)
10            return 0;
11
12        int mid = low + (high - low) / 2;
13
14        int count = 0;
15
16        count += mergeSort(nums, low, mid);
17        count += mergeSort(nums, mid + 1, high);
18
19        count += countPairs(nums, low, mid, high);
20
21        merge(nums, low, mid, high);
22
23        return count;
24    }
25
26    private int countPairs(
27            int[] nums,
28            int low,
29            int mid,
30            int high) {
31
32        int count = 0;
33
34        int right = mid + 1;
35
36        for (int i = low; i <= mid; i++) {
37
38            while (right <= high &&
39                   nums[i] > 2L * nums[right]) {
40                right++;
41            }
42
43            count += right - (mid + 1);
44        }
45
46        return count;
47    }
48
49    private void merge(
50            int[] nums,
51            int low,
52            int mid,
53            int high) {
54
55        int[] temp =
56            new int[high - low + 1];
57
58        int left = low;
59        int right = mid + 1;
60        int idx = 0;
61
62        while (left <= mid &&
63               right <= high) {
64
65            if (nums[left] <= nums[right]) {
66                temp[idx++] = nums[left++];
67            } else {
68                temp[idx++] = nums[right++];
69            }
70        }
71
72        while (left <= mid) {
73            temp[idx++] = nums[left++];
74        }
75
76        while (right <= high) {
77            temp[idx++] = nums[right++];
78        }
79
80        for (int i = 0; i < temp.length; i++) {
81            nums[low + i] = temp[i];
82        }
83    }
84}