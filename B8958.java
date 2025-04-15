import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int cnt = 0;
            int result = 0;

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') {
                    cnt++;
                    result += cnt;
                } else {
                    cnt = 0;
                }
            }

            System.out.println(result);
        }
    }
}
