import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] word = new String[5][15];

        for(int i = 0 ; i < 5; i++) {
            word[i] = sc.nextLine().split("");
        }

        for(int i = 0 ; i < 15; i++) {
            for(int j = 0 ; j < 5; j++) {
                if (word[j].length > i) {
                    System.out.print(word[j][i]);
                }
            }
        }
    }
}
