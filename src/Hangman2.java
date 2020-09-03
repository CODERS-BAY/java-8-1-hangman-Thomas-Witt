import java.util.Scanner;

public class Hangman2 {
    public static void main(String[] args) {
        System.out.println("Please choose a secret word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int wincounter = word.length();

        char[] character = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            character[i] = word.charAt(i);
        }
        System.out.println("\n\n\n\n\n\n\n");

        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hiddenWord[i] = '*';
        }
        while (wincounter != 0) {

            System.out.println("Choose a letter:");
            String userInput = scanner.next();
            char choice = userInput.charAt(0);


            char[] faildAttempts = new char[8];
            System.out.println(hiddenWord);
            System.out.println(" \n" +
                    "    ___________\n" +
                    "    || /      |\n" +
                    "    ||/       O\n" +
                    "    ||       /|\\\n" +
                    "    ||       / \\\n" +
                    "    || \n" +
                    "~~~~~~~~~~~~~~~~~~~"


            );

            for (int i = 0; i < word.length(); i++) {
                if (choice == character[i]) {
                    hiddenWord[i] = character[i];
                    wincounter--;
                }
            }
            System.out.println(hiddenWord);


        }
    }
}
