package src.homework5;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-_=+";
    private static final String ALL_CHARS = LETTERS + DIGITS + SPECIALS;
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomPassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Довжина пароля має бути більше 0");
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(ALL_CHARS.charAt(random.nextInt(ALL_CHARS.length())));
        }
        return password.toString();
    }

    public static boolean isStrong(String password) {
        if (password.length() < 8)
            return false;

        boolean hasLetter = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (LETTERS.indexOf(ch) != -1)
                hasLetter = true;
            else if (DIGITS.indexOf(ch) != -1)
                hasDigit = true;
            else if (SPECIALS.indexOf(ch) != -1)
                hasSpecial = true;
        }

        return hasLetter && hasDigit && hasSpecial;
    }

    public static String generateStrongPassword() {
        String password;
        do {
            password = generateRandomPassword(10);
        } while (!isStrong(password));

        return password;
    }

    public static void main(String[] args) {
        String password = generateRandomPassword(8);
        System.out.println("Згенерований пароль: " + password);
        System.out.println("Надійність: " + isStrong(password));

        String strongPassword = generateStrongPassword();
        System.out.println("Згенерувати надійний пароль: " + strongPassword);
        System.out.println("Надійність: " + isStrong(strongPassword));
    }
}
