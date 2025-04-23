import java.util.Scanner;

public class B2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();
        int[] result = new int[testCaseCount + 1];

        for(int i = 0 ; i < testCaseCount; i++) {
            int floor = sc.nextInt();
            int num = sc.nextInt();
            result[i] = apartment(floor, num);
        }

        for(int i = 0 ; i < testCaseCount; i++) {
            System.out.println(result[i]);
        }
    }

    public static int apartment(int floor, int num) {
        int[][] apt = new int[floor + 1][num + 1];

        for (int i = 0 ; i <= num; i++) {
            apt[0][i] = i;
        }

        for(int i = 1; i <= floor; i++) {
            apt[i][1] = 1;
            for(int j = 1 ; j <= num; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        return apt[floor][num];
    }
}
