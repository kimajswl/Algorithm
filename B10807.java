import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
