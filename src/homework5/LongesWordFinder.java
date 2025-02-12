package src.homework5;

import java.util.Scanner;

public class LongesWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть рядок: ");
        String input = scanner.nextLine();

        String longestWord = findLongestWord(input);

        System.out.println("Найдовше слово: " + longestWord);
    }

    public static String findLongestWord(String str) {
        String[] words = str.split("[^a-zA-Z]+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
