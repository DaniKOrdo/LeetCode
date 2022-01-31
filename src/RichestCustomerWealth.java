public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int nOld, n = 0;

        for (int i = 0; i < accounts.length; i++) {
            nOld = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                nOld += accounts[i][j];
            }

            if (n < nOld) n = nOld;
        }
        return n;
    }
}
