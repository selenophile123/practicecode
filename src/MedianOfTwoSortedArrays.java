class Solution {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3,};        //1,2,3,6,4,5,9
        int nums2[] = {4, 5, 9};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int part1 = low + (high - low) / 2;
            int part2 = (m + n + 1) / 2 - part1;

            int maxLeftNums1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int maxLeftNums2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minRightNums1 = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];
            int minRightNums2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];

            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                } else {
                    return Math.max(maxLeftNums1, maxLeftNums2);
                }
            } else if (maxLeftNums1 > minRightNums2) {
                high = part1 - 1;
            } else {
                low = part1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
