class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // Merge arrays into sum[]
        int[] sum = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                sum[k++] = nums1[i++];
            } else {
                sum[k++] = nums2[j++];
            }
        }
        while (i < n) sum[k++] = nums1[i++];
        while (j < m) sum[k++] = nums2[j++];

        int x = sum.length;
        double median = 0.0;   // ✅ initialize to avoid compile error

        if (x % 2 != 0) { 
            median = sum[x / 2];   // middle element
        } else {
            median = (sum[x / 2 - 1] + sum[x / 2]) / 2.0; // avg of middle two
        }

        return median;
    }
}