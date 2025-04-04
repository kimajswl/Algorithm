import java.util.Scanner;

public class B1010 {
    static int[][] bridgeSpot = new int[30][30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseCount = sc.nextInt();

        for (int i = 0; i < testcaseCount; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            System.out.println(putBridge(right, left));
        }
        sc.close();
    }

    static int putBridge(int left, int right) {
        if (bridgeSpot[left][right] > 0) {
            return bridgeSpot[left][right];
        }

        if (left == right || right == 0) {
            bridgeSpot[left][right] = 1;
            return 1;
        }

        bridgeSpot[left][right] = putBridge(left - 1, right - 1) + putBridge(left - 1, right);

        return bridgeSpot[left][right];
    }
}