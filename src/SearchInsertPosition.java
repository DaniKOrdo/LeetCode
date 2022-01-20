public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // [1,3,4,5] 0
        int left = 1;
        int right = nums.length; // 5
        while (left < right) { // 0 < 5
            int mid = left + (right - left) / 2; // 2

            if (nums[mid-1] < target && nums[mid] > target) return mid;
            if (nums[mid] == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
