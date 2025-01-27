package src.homework2;

import java.util.Scanner;

public class Сompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть вік учасника: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ведіть громадянство участника: ");
        String citizenship = scanner.nextLine().trim();

        System.out.print("Ведіть номер заявки: ");
        String applicationNumber = scanner.nextLine().trim();

        System.out.print("Ведіть прізвище учасника: ");
        String lastName = scanner.nextLine().trim();

        String[] allowedCountries = { "Польша", "Україна", "США" };

        String[] blackList = { "Іванов", "Сидоренко", "Колуб" };

        boolean ageValid = age >= 18 && age <= 35;
        boolean citizenshipValid = false;
        for (String country : allowedCountries) {
            if (country.equalsIgnoreCase(citizenship)) {
                citizenshipValid = true;
                break;
            }
        }
        boolean applicationValid = applicationNumber != null && !applicationNumber.isEmpty();
        boolean notInBlackList = true;
        for (String blacklistedName : blackList) {
            if (blacklistedName.equalsIgnoreCase(lastName)) {
                notInBlackList = false;
                break;
            }
        }

        if (ageValid && citizenshipValid && applicationValid && notInBlackList) {
            System.out.println("Учасник допущений до конкурсу.");
        } else {
            System.out.println("Учасник не допущений до конкурсу.");
        }
    }
}
