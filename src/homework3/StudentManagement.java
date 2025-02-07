package src.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    double grade;
    String faculty;

    public Student(String name, int age, double grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Середній бал: " + grade + ", Факультет: " + faculty;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати студента");
            System.out.println("2. Показати всіх студентов");
            System.out.println("3. Найти студентів по факультету");
            System.out.println("4. Удалити студента по імені");
            System.out.println("5. Вийти");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Ведіть ім'я: ");
                String name = scanner.nextLine();
                System.out.print("Ведіть вік: ");
                int age = scanner.nextInt();
                System.out.print("Ведіть середній бал: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ведіть факультет: ");
                String faculty = scanner.nextLine();

                students.add(new Student(name, age, grade, faculty));
                System.out.println("Студент додан");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("Список студентів пустий.");
                } else {
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Ведіть факультет для пошуку: ");
                String facultySearch = scanner.nextLine();
                for (Student student : students) {
                    if (student.faculty.equalsIgnoreCase(facultySearch)) {
                        System.out.println(student);
                    }
                }

            } else if (choice == 4) {
                System.out.print("Ведіть ім'я студента для видалення: ");
                String nameDelete = scanner.nextLine();
                students.removeIf(student -> student.name.equalsIgnoreCase(nameDelete));
                System.out.println("Студент видалений");

            } else if (choice == 5) {
                // Вихід з програми
                System.out.println("Програма закінчена.");
                break;

            } else {
                System.out.println("Неправильний вибір, спробуйте знову.");
            }
        }
    }
}
