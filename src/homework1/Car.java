public class Car {
    private String make; // Марка автомобіля
    private String model; // Модель автомобіля
    private int year; // Рік випуску
    private double mileage; // Пробіг автомобіля

    // Конструктор для створення автомобіля
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Метод для збільшення пробігу
    public void increaseMileage(double additionalMileage) {
        if (additionalMileage > 0) {
            this.mileage += additionalMileage;
        } else {
            System.out.println("Додатковий пробіг має бути позитивним.");
        }
    }

    // Метод для відображення інформації про автомобіль
    public void displayInfo() {
        System.out.println("Інформація про автомобіль:");
        System.out.println("Марка: " + this.make);
        System.out.println("Модель: " + this.model);
        System.out.println("Рік випуску: " + this.year);
        System.out.println("Пробіг: " + this.mileage + " км");
    }

    // Головний метод для перевірки класу
    public static void main(String[] args) {
        Car myCar1 = new Car("Porsche", "Cayenne", 2018, 30000.0);
        myCar1.displayInfo();

        myCar1.increaseMileage(1500.0); // Збільшує пробіг
        myCar1.displayInfo();

        Car myCar2 = new Car("Toyota", "RAV4", 2021, 10000.0);
        myCar2.displayInfo();

        myCar2.increaseMileage(700.0);
        myCar2.displayInfo();
    }
}