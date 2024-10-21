import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int result = 0;

        if(sugar < 3 || sugar == 4) {
            System.out.println(-1);
            return;
        }

        int bag = 0;
        while(sugar%5 != 0) {
            sugar -= 3;
            bag++;
        }

        if(sugar < 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(bag+sugar/5);
    }
}
