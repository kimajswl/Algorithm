public class B4673 {
    static boolean[] isNotSelfNumber = new boolean[10036];

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int dn = kap(i);
            if (dn < 10036) {
                isNotSelfNumber[dn] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isNotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int kap(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
