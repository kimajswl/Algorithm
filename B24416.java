import java.util.Scanner;

public class B24416 {
    public static int fibCnt = 1; // 기본 값 1
    public static int fibonacciCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n); // fibo 케이스
        fibonacci(n); // fibonacci 케이스

        System.out.println(fibCnt + " " + fibonacciCnt);
    }

    public static int fib(int n) {
        if(n == 1 || n == 2) return 1;
        else {
            fibCnt++; // 돌때마다 cnt 증가
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        int[] f = new int[n + 1]; // 받은 정수보다 +1해서 여유있게
        f[1] = f[2] = 1; // 이 부분에서 기본값 설정
        for(int i = 3; i <= n; i++) {
            fibonacciCnt++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
