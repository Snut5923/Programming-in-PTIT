
import java.util.Scanner;

public class xulyvanban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine());
        }
        String[] sentences = text.toString().split("[.!?]");
        for (String sentence : sentences) {
            sentence = sentence.trim().toLowerCase();
            if (!sentence.isEmpty()) {
                System.out.println(Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1));
            }
        }
    }
}

