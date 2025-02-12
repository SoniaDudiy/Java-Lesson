package src.homework5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ім'я: " + name + ", Зарплата: " + salary;
    }
}

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortBySalary() {
        employees.sort(Comparator.comparingInt(Employee::getSalary));
    }

    public void sortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
    }

    public List<Employee> filterBySalaryRange(int min, int max) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() >= min && employee.getSalary() <= max) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "John", 5000));
        manager.addEmployee(new Employee(2, "Alice", 7000));
        manager.addEmployee(new Employee(3, "Bob", 6000));

        System.out.println("Співробітники:");
        manager.printEmployees();

        manager.sortBySalary();
        System.out.println("\nСортування по зарплаті:");
        manager.printEmployees();

        System.out.println("\nСпівробітники із зарплатой 5000-6000:");
        List<Employee> filtered = manager.filterBySalaryRange(5000, 6000);
        for (Employee e : filtered) {
            System.out.println(e);
        }
    }
}
