public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int cont = 0;
        if (word.length() == 1) return true;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                cont++;
            }
        }

        if (word.length() == cont || cont == 0) return true;
        return cont == 1 && Character.isUpperCase(word.charAt(0));
    }
}
