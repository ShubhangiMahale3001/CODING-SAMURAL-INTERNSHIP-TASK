package PangramChecker;
import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        boolean[] alphabetPresent = new boolean[26];
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                if (!alphabetPresent[c - 'a']) {
                    alphabetPresent[c - 'a'] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}