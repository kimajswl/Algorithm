import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            int student = sc.nextInt();
            int[] score = new int[student];

            for (int j = 0; j < student; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            double aver = (double) sum / student;

            for (int k = 0; k < student; k++) {
                if (score[k] > aver) {
                    cnt++;
                }
            }

            double result = ((double) cnt / student) * 100;
            System.out.printf("%.3f%%\n", result);
        }

    }

}
