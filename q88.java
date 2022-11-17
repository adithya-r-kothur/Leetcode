import java.util.Arrays;

public class q88 {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int a = 0;
            for (int k = m; k < m + n; k++) {
                nums1[k] = nums2[a++];
            }
            Arrays.sort(nums1);
        }
    }
}
