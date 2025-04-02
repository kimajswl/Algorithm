import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.nextLine();

        List<String> wordList;
        int[] count = new int[127];

        wordList = splitWord(word);

        for(int i = 0 ; i < wordList.size(); i++) {
            char c = wordList.get(i).charAt(0);
            int wordASCII = c;
            if(wordASCII > 90) wordASCII -= 32;
            count[wordASCII]++;
        }

        findMaxWord(count);
    }

    public static List<String> splitWord(String word) {
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.substring(i, i+1));
        }
        return wordList;
    }

    public static void findMaxWord(int[] count) {
        int max = 0;
        int maxVal = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] > count[max]){
                maxVal = count[i];
                max = i;
            }
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] == maxVal && i != max){
                System.out.println("?");
                return;
            }
        }

        char result = (char)max;
        System.out.println(result);
    }
}
