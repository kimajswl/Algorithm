import java.io.*;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[3];
        int sum;
        int snail = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0 ; i < 3; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        sum = (array[2] - array[1] - 1) / (array[0] - array[1]) + 1;

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
