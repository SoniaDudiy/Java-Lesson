package src.homework1;

public class Calculator {
    public int publicNumber = 15;

    protected int protectedNumber = 22;

    int defaultNumber = 35;

    private int privateNumber = 50;

    public void displayNumbers() {
        System.out.println("Public: " + publicNumber);
        System.out.println("Protected: " + protectedNumber);
        System.out.println("Default: " + defaultNumber);
        System.out.println("Private: " + privateNumber);
    }

    // Метод додавання
    public int add(int a, int b) {
        return a + b;
    }

    // Метод віднімання
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод множення
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод ділення
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Помилка: ділення на нуль!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.displayNumbers();

        System.out.println("Додавання: " + calc.add(5, 3));
        System.out.println("Віднімання: " + calc.subtract(10, 4));
        System.out.println("Множення: " + calc.multiply(6, 7));
        System.out.println("Ділення: " + calc.divide(8, 2));
    }
}
