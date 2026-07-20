// Last updated: 20/07/2026, 11:51:42
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
4        while(p2 >=0 ){
5            if(p1 >=0 && nums1[p1] > nums2[p2]){
6                nums1[i--] = nums1[p1--];
7            } 
8            else{
9                nums1[i--] = nums2[p2--];
10            }
11        }
12       }
13}