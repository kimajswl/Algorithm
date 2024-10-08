import java.util.Scanner;

public class B10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        String reverse;

        word = scanner.nextLine();

        StringBuffer sb = new StringBuffer(word);
        reverse = sb.reverse().toString();

        if(word.equals(reverse)) System.out.println(1);
        else System.out.println(0);

    }
}
