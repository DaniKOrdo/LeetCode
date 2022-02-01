public class ReverseWordsInAStringIII { // Pendiente de revisar
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res=new StringBuilder();

        for (String word: words) {
            res.append(new StringBuffer(word).reverse()).append(" ");
        }

        return res.toString().trim();
    }
}
