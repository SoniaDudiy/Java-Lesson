package src.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Строка 1: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Строка 2: ");
        String str2 = scanner.nextLine().toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("Строки є анаграмами!");
        } else {
            System.out.println("Строки НЕ є анаграмами.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
