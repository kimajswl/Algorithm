public class B15596 {
    public static void main(String[] args) {
        int[] arr = {1000000, 2000000, 3000000};
        long result = SumCalculator.sum(arr, arr.length);
        System.out.println("합계: " + result);
    }

    public class SumCalculator {
        public static long sum(int[] a, int n) {
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += a[i];
            }
            return ans;
        }
    }
}
