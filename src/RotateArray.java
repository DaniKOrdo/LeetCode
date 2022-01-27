public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        // Time Limit Exceeded (https://leetcode.com/submissions/detail/629016122/testcase/)
        /* for (int i = 0; i < k; i++) {
            int lastNum = nums[nums.length - 1];

            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = lastNum;
        }
        return nums; */

        int[] copy = new int[nums.length];
        for (int i=0; i<copy.length; i++) {
            copy[i] = nums[i];
        }

        for (int i=0; i<nums.length; i++) {
            nums[(i+k)%nums.length] = copy[i];
        }

        return nums;
    }
}
