package src.homework2;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Конструктор для створення книги
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Метод для зменшення ціни на задану суму
    public void discountPrice(double discount) {
        if (discount > 0 && discount <= price) {
            this.price -= discount;
        } else {
            System.out.println("Знижка повинна бути більшою за 0 і меншою або рівною ціні книги.");
        }
    }

    // Метод для відображення інформації про книгу
    public void displayInfo() {
        System.out.println("Інформація про книгу:");
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік видання: " + yearPublished);
        System.out.printf("Ціна: %.2f грн\n", price);
    }

    // Головний метод для перевірки класу
    public static void main(String[] args) {
        Book book = new Book("Переломний рік", "Бріа", 2024, 300.0);
        book.displayInfo(); // Виводить інформацію про книгу

        book.discountPrice(50.0); // Зменшує ціну на 50 грн
        book.displayInfo(); // Виводить оновлену інформацію

        book.discountPrice(600.0); // Спроба задати некоректну знижку
        book.displayInfo(); // Інформація без змін
    }
}
