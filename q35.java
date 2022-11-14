public class q35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int start = 0;
            int last = n - 1;
            int mid = start + (last - start) / 2;
            while (start <= last) {
                mid = start + (last - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    last = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return start;
        }

    }
}
