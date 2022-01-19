/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);

public class FirstBadVersion {
    // Time Limit Exceeded
    public int firstBadVersion(int n) {
        for (int i = 0; i < n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }

    // Best option
    public int firstBadVersion2(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
*/

