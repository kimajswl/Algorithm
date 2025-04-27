import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("(?<!^)");

        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        int aInt = stringToint(arr);

        String b = sc.next();
        String[] brr = b.split("(?<!^)");

        temp= brr[0];
        brr[0] = brr[2];
        brr[2] = temp;

        int bInt = stringToint(brr);

        System.out.println(Math.max(aInt, bInt));
    }

    private static int stringToint(String[] arr) {
        int a = 0;
        for(int i = 0 ; i < 3; i++) {
            a  = a * 10;
            a = a + Integer.valueOf(arr[i]);
        }
        return a;
    }
}
