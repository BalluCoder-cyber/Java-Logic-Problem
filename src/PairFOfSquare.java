public class PairFOfSquare {
    static int pairSquare(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i * i * i) + (j * j * j) == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(pairSquare(28));

    }
}
