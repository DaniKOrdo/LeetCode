public class ReverseString {
    public void reverseString(char[] s) {
        int last = s.length - 1;
        char save;
        for (int i = 0; i < s.length / 2; i++) {
            save = s[last];
            s[last] = s[i];
            s[i] = save;
            last--;
        }
    }
}
