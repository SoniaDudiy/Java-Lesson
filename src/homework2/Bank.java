package src.homework2;

public class Bank {
    private String name;
    private double balance;
    private double interestRate;

    public Bank(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Метод для внесення грошей
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount);
        } else {
            System.out.println("Сума повинна бути більше 0.");
        }
    }

    // Метод для зняття грошей
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято: " + amount);
        } else {
            System.out.println("Недостатньо коштів або некоректна сума!");
        }
    }

    // Метод для нарахування відсотків
    public void applyInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Нараховано відсотки.");
    }

    // Метод для виведення інформації про банк
    public void displayInfo() {
        System.out.println("Банк: " + name);
        System.out.println("Баланс: " + balance);
        System.out.println("Відсоткова ставка: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Bank myBank = new Bank("MyBank", 1000.0, 5.0);

        myBank.displayInfo();
        myBank.deposit(500);
        myBank.withdraw(200);
        myBank.applyInterest();
        myBank.displayInfo();
    }
}
