import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int um = scanner.nextInt();

        m += um;

        if (m >= 60) {
            h += m / 60;
            m %= 60;
            if (h >= 24) {
                h %= 24;
            }
        }
        System.out.println(h + " " + m);

        scanner.close();
    }
}
