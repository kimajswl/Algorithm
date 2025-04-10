import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 666;
        while (count < n) {
            if (String.valueOf(i).contains("666")) {
                count++;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}
