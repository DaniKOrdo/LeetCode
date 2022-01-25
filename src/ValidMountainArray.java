public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length >= 3) {
            int pointer = 0;

            if (arr[0] > arr[1]) return false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    pointer = i;
                } else {
                    break;
                }
            }

            if (pointer + 1 >= arr.length) return false;

            for (int i = pointer; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) continue;
                return false;
            }

            return true;
        }
        return false;
    }
}