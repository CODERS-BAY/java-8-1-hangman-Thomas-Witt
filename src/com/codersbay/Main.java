package com.codersbay;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String secretWord;
        System.out.println("Please enter the secret word you want to play:");
        Scanner scanner = new Scanner(System.in);
        secretWord = scanner.next();

        char[] singleLetter;
        singleLetter = secretWord.toCharArray();
        char[] hiddenWord = new char[singleLetter.length];
        Arrays.fill(hiddenWord, '*');
        char[] falseLetters = new char[10];

        String userInput;
        Scanner scanner1 = new Scanner(System.in);
        int falseTries = 0;
        System.out.println("\n\n\n\n\n\n");
        IncorrectGuess0(hiddenWord, falseLetters);
        while (falseTries < 10) {
            do {
                System.out.println("Please guess a letter:");
                userInput = scanner1.next();
                if (userInput.length() > 1)
                    System.out.println("Please only type one letter at a time!");
            } while (userInput.length() != 1);
            char firstChar = userInput.charAt(0);
            int code = (int) firstChar;
            int correctAnswer = 0;

            for (int i = 0; i < hiddenWord.length; i++) {
                if (code == (int) singleLetter[i] || code - 32 == (int) singleLetter[i] || code + 32 == (int) singleLetter[i]) {
                    hiddenWord[i] = singleLetter[i];
                    correctAnswer = 1;
                }
            }
            if (correctAnswer == 0) {
                falseLetters[falseTries] = firstChar;
                falseTries++;

            }
            switch (falseTries) {
                case 0:
                    IncorrectGuess0(hiddenWord, falseLetters);
                    break;
                case 1:
                    IncorrectGuess1(hiddenWord, falseLetters);
                    break;
                case 2:
                    IncorrectGuess2(hiddenWord, falseLetters);
                    break;
                case 3:
                    IncorrectGuess3(hiddenWord, falseLetters);
                    break;
                case 4:
                    IncorrectGuess4(hiddenWord, falseLetters);
                    break;
                case 5:
                    IncorrectGuess5(hiddenWord, falseLetters);
                    break;
                case 6:
                    IncorrectGuess6(hiddenWord, falseLetters);
                    break;
                case 7:
                    IncorrectGuess7(hiddenWord, falseLetters);
                    break;
                case 8:
                    IncorrectGuess8(hiddenWord, falseLetters);
                    break;
                case 9:
                    IncorrectGuess9(hiddenWord, falseLetters);
                    break;
                case 10:
                    IncorrectGuess10(secretWord, falseLetters);
                    break;
                default:
                    System.out.println("Oh oh, something went wrong");
            }
            boolean abort = true;
            for (int i = 0; i < hiddenWord.length; i++) {
                if (hiddenWord[i] == '*') {
                    abort = false;
                }
            }
            if (abort) {
                System.out.println("Congratulation! You solved the puzzle!");
                break;
            }
        }
    }

    private static void IncorrectGuess0(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                "                      The secret word:\n" +
                        "                      " + new String(hiddenWord) + "\n" +
                        " \n" +
                        " \n" +
                        " \n" +
                        "                      False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess1(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                "                      The secret word:\n" +
                        " ||                   " + new String(hiddenWord) + "\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess2(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " ||                   " + new String(hiddenWord) + "\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess3(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /                 " + new String(hiddenWord) + "\n" +
                        " ||/\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess4(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess5(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/       O\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess6(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/       O\n" +
                        " ||        |\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess7(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/       O\n" +
                        " ||       /|\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess8(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/       O\n" +
                        " ||       /|\\\n" +
                        " ||\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

    private static void IncorrectGuess9(char[] hiddenWord, char[] falseLetters) {
        System.out.println(
                " ===========          The secret word:\n" +
                        " || /      |          " + new String(hiddenWord) + "\n" +
                        " ||/       O\n" +
                        " ||       /|\\\n" +
                        " ||       / \n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }


    private static void IncorrectGuess10(String secretWord, char[] falseLetters) {
        System.out.println(
                " ===========          Oh no! You loose. The secret word was:\n" +
                        " || /      |          " + secretWord + "\n" +
                        " ||/       O\n" +
                        " ||       /|\\\n" +
                        " ||       / \\\n" +
                        " ||                   False letters:\n" +
                        "~~~~~~~~~~~~~~~       " + (Arrays.toString(falseLetters)) + "\n"
        );
    }

}
