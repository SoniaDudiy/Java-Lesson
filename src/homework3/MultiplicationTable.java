package src.homework3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть число (от 1 до 10): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Помилка: ведіть число від 1 до 10.");
            return;
        }

        System.out.println("Таблица множення для числа " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
