import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] number = new double[1000];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextDouble();
            if (max < number[i]) {
                max = number[i];
            }
        }

        for (int i = 0; i < n; i++) {
            number[i] = (number[i] / max) * 100.0;
            sum += number[i];
        }

        System.out.printf("%.6f\n", sum / n);

        sc.close();
    }
}
