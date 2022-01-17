public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int length = temp.length();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++)
        {
            numbers[i] = temp.charAt(i) - '0';
        }

        if (length % 2 == 0) { // ODD
            if (length == 2) return numbers[0] == numbers[1];

            int divider = length / 2;
            int right = divider;
            int left = divider - 1;
            for (int i = 0; i < divider; i++) {
                if (numbers[right] != numbers[left]) return false;
                ++right;
                --left;
            }

        } else { // EVEN
            int divider = length / 2;
            int right = divider + 1;
            int left = divider - 1;
            for (int i = 0; i < divider; i++) {
                if (numbers[right] != numbers[left]) return false;
                ++right;
                --left;
            }
        }
        return true;
    }
}


