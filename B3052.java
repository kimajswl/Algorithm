import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0, num = 0;
        int[] number = new int[10];

        for (int i = 0; i < 10; i++) {
            number[i] = scanner.nextInt();
            number[i] %= 42;
        }

        for (int i = 0; i < 10; i++) {
            cnt = 0;
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}
