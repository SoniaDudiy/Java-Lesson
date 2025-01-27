package src.homework2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть суму покупки: ");
        double amount = scanner.nextDouble();

        System.out.print("Клієнт VIP (true/false): ");
        boolean isVip = scanner.nextBoolean();

        double discount = 0;
        if (amount >= 1000 && amount <= 5000) {
            discount = 5;
        } else if (amount > 5000 && amount <= 10000) {
            discount = 10;
        } else if (amount > 10000) {
            discount = 15;
        }

        double discountAmount = amount * discount / 100;
        double total = amount - discountAmount;

        if (isVip) {
            double vipDiscount = total * 5 / 100;
            total -= vipDiscount;
            System.out.printf("Додаткова знижка для VIP: %.2f грн.%n", vipDiscount);
        }

        System.out.printf("Сума покупки до знижки: %.2f грн.%n", amount);
        System.out.printf("Знижка: %.2f грн.%n", discountAmount);
        System.out.printf("Кінцева сума до оплати: %.2f грн.%n", total);
    }
}
