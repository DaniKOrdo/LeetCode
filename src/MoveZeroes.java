public class MoveZeroes {                // i = 1 c = 5
    public void moveZeroes(int[] nums) { // [1,0,0,0,0,3,12]
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            while (count < nums.length - 1 && nums[count] == 0) {
                count++;
            }

            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
            } else {
                count++;
            }

        }
    }
}


// With making a copy
        /*
        int[] copy = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                copy[count] = nums[i];
                count++;
            }
        }

        for (int i = count; i > nums.length - 1; i--) {
            copy[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[i];
        }
        */


// BEST SOLUTION
        /*
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter++] = nums[i];
            }
        }
        for (int i = counter; i < nums.length; i++) {
            nums[i] = 0;
        }
         */