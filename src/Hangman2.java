import java.util.Arrays;
import java.util.Scanner;

public class Hangman2 {
    public static void main(String[] args) {
        System.out.println("Please choose a secret word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word = word.toLowerCase();
        int wincounter = word.length();
        int failcounter = 0;
        int wrongTries = 8;

        char[] character = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            character[i] = word.charAt(i); // fills the char-array with the letters of the chosen word. This will not be shown, it is just for comparing right/wrong tries
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hiddenWord[i] = '*'; // creates a char-array with all '*' with the length of the chosen word. This will be displayed.
        }
        char[] failedAttempts = new char[wrongTries]; // creates a char-array which displays the wrong characters.

        while (wincounter != 0 && failcounter < wrongTries) {

            System.out.print("You need to find the word:        ");
            System.out.println(hiddenWord);

            switch (failcounter) {
                case (0) -> System.out.println(
                        "\n" +
                                "\n" +
                                "\n" +
                                "                          Wrong letters:\n" +
                                "                        " + Arrays.toString(failedAttempts) + "\n" +
                                "\n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (1) -> System.out.println(
                        "\n" +
                                "    ||\n" +
                                "    ||\n" +
                                "    ||                    Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (2) -> System.out.println(
                        "    ___________\n" +
                                "    || /\n" +
                                "    ||/\n" +
                                "    ||                    Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (3) -> System.out.println(
                        "    ___________\n" +
                                "    || /      |\n" +
                                "    ||/       O\n" +
                                "    ||                    Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (4) -> System.out.println(
                        "    ___________\n" +
                                "    || /      |\n" +
                                "    ||/       O\n" +
                                "    ||        |           Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (5) -> System.out.println(
                        "    ___________\n" +
                                "    || /      |\n" +
                                "    ||/       O\n" +
                                "    ||       /|           Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (6) -> System.out.println(
                        "    ___________\n" +
                                "    || /      |\n" +
                                "    ||/       O\n" +
                                "    ||       /|\\         Wrong letters:\n" +
                                "    ||                  " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
                case (7) -> System.out.println(
                        "    ___________\n" +
                                "    || /      |\n" +
                                "    ||/       O\n" +
                                "    ||       /|\\         Wrong letters:\n" +
                                "    ||       /          " + Arrays.toString(failedAttempts) + "\n" +
                                "    || \n" +
                                "~~~~~~~~~~~~~~~~~~~"
                );
            }

            System.out.println("Choose a letter:");
            String userInput = scanner.next();
            char choice = userInput.charAt(0);
            boolean correctInput;
            do {
                correctInput = true;
                for (int i = 0; i < word.length(); i++) {
                    if (choice == hiddenWord[i]) {
                        System.out.println("You have already chosen this letter. Please choose another one:");
                        userInput = scanner.next();
                        choice = userInput.charAt(0);
                        correctInput = false;
                    }
                }
                for (int i = 0; i < wrongTries; i++) {
                    if (choice == failedAttempts[i]) {
                        System.out.println("You have already chosen this letter. Please choose another one:");
                        userInput = scanner.next();
                        choice = userInput.charAt(0);
                        correctInput = false;
                    }
                }
            } while (!correctInput);
            int isItCorrect = wincounter;
            for (int i = 0; i < word.length(); i++) {
                if (choice == character[i]) {
                    hiddenWord[i] = character[i];
                    wincounter--;
                }
            }
            if (isItCorrect == wincounter) {
                failedAttempts[failcounter] = choice;
                failcounter++;
            }

        }
        if (wincounter == 0) {
            System.out.println("Congratulations! You saved the hangman! The word was \"" + word + "\"");
        } else {
            System.out.println(
                    "    ___________\n" +
                            "    || /      |\n" +
                            "    ||/       O\n" +
                            "    ||       /|\\         Wrong letters:\n" +
                            "    ||       / \\       " + Arrays.toString(failedAttempts) + "\n" +
                            "    || \n" +
                            "~~~~~~~~~~~~~~~~~~~"
            );
            System.out.println("Oh dear. The hangman is dead. The word was \"" + word + "\" Try again!");
        }
    }
}
