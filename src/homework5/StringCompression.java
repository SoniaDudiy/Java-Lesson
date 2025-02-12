package src.homework5;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть рядок: ");
        String input = scanner.nextLine();

        String compressed = compressString(input);

        System.out.println("Зжатий рядок: " + compressed);
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
