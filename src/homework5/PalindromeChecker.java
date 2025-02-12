package src.homework5;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть рядок: ");
        String input = scanner.nextLine();

        // Викликаємо метод перевірки
        if (isPalindrome(input)) {
            System.out.println("Рядок є паліндромом.");
        } else {
            System.out.println("Рядок паліндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
