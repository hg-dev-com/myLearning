import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class HighSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 90000),
                new Employee(3, "C", 70000),
                new Employee(4, "D", 100000),
                new Employee(5, "E", 85000)
        );

        List<Employee> top3 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        top3.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));
    }
}