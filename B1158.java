import java.util.ArrayList;
import java.util.Scanner;

public class B1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> delete = new ArrayList<>();

        boolean[] Josephus = new boolean[n];

        while(delete.size() < n) {
            for(int j = 0 ; j < n; j++) {
                if (Josephus[j] == true) continue;
                cnt++;
                if (cnt == k) {
                    delete.add(j + 1);
                    Josephus[j] = true;
                    cnt = 0;
                }
            }
        }

        System.out.print("<");
        for(int i = 0; i < delete.size() - 1; i++) {
            System.out.print(delete.get(i) + ", ");
        }
        System.out.print(delete.get(delete.size() - 1)+">");
    }
}
