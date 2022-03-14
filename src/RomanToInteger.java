public class RomanToInteger {
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];

        for (int i = 0; i < nums.length; i++) {
            switch (s.charAt(i)) {
                case 'M' -> nums[i] = 1000;
                case 'D' -> nums[i] = 500;
                case 'C' -> nums[i] = 100;
                case 'L' -> nums[i] = 50;
                case 'X' -> nums[i] = 10;
                case 'V' -> nums[i] = 5;
                case 'I' -> nums[i] = 1;
            }
        }

        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }

        return sum + nums[nums.length - 1];
    }
}
