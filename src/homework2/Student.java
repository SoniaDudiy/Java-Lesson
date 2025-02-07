package src.homework2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private List<Integer> grades;

    // Конструктор для створення студента
    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    // Метод для додавання оцінки до списку
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Оцінка повинна бути в межах від 0 до 100.");
        }
    }

    // Метод для розрахунку середньої оцінки
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0; // Якщо немає оцінок, повертається 0
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    // Метод для відображення інформації про студента
    public void displayInfo() {
        System.out.println("Інформація про студента:");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Номер студентського квитка: " + studentID);
        System.out.println("Оцінки: " + grades);
        System.out.printf("Середня оцінка: %.2f\n", calculateAverageGrade());
    }

    // Головний метод для перевірки класу
    public static void main(String[] args) {
        Student student = new Student("Софія", "Гавриленко", "AB12395");
        student.displayInfo(); // Виводить інформацію про студента без оцінок

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        student.addGrade(110); // Некоректна оцінка

        student.displayInfo(); // Виводить інформацію з оцінками і середньою оцінкою
    }
}
