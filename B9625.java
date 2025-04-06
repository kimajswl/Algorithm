import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(bf.readLine());

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        aList.add(1);
        bList.add(0);

        for (int i = 1; i <= k; i++) {
            int a = bList.get(i - 1);
            int b = aList.get(i - 1) + bList.get(i - 1);
            aList.add(a);
            bList.add(b);
        }

        bw.write(aList.get(k) + " " + bList.get(k));
        bw.flush();
        bw.close();
    }
}
