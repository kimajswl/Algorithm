import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        String[] words = str.split(" ");

        for(int  i = 0; i < words.length; i++) {
            if(words[i].length() > 0) {
                count++;
            }
        }


        System.out.println(count);
    }
}
