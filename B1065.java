import java.util.Scanner;

public class B1065 {
    public static int han(int n) {
        int h, t, o, cnt = 0;
        if (n < 100) {
            return n;
        } else {
            for (int i = 100; i <= n; i++) {
                h = i / 100;
                t = (i % 100) / 10;
                o = i % 10;
                if ((h - t) == (t - o)) {
                    cnt++;
                }
            }
            return cnt + 99;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(han(num));
    }
}
