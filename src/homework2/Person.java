package src.homework2;

public class Person {
    private String name;
    private int age;
    private final String id;

    public static int totalPersons = 0;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = (age < 0) ? 0 : age;
        this.id = id;
        totalPersons++;
    }

    public Person() {
        this("Unknown", 18, "0000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0) ? 0 : age;
    }

    public String getId() {
        return id;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    public boolean isOlderThan(int age) {
        return this.age > age;
    }

    public final void displayGreeting() {
        System.out.println("Привіт, мене звати " + name + "!");
    }

    // Статический метод для вывода общего количества людей
    public static void printTotalPersons() {
        System.out.println("Загальна кількість людей: " + totalPersons);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Софія", 19, "2631");
        Person p2 = new Person("Наталія", 40, "4618");
        Person p3 = new Person("Марія", 22, "5536");

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println(p1.getName() + " старше 20: " + p1.isOlderThan(20));
        System.out.println(p2.getName() + " старше 35: " + p2.isOlderThan(35));
        System.out.println(p3.getName() + " старше 18: " + p3.isOlderThan(18));
        Person.printTotalPersons();

        p1.displayGreeting();
        p2.displayGreeting();
        p3.displayGreeting();
    }
}
