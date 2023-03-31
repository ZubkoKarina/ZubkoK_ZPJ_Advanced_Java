import java.util.Arrays;
import java.util.Comparator;

public class SortEmployees {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Employee("Karina", 9950000),
            new Employee("Anna", 60000),
            new Employee("Alina", 21500),
            new Employee("Zoi", 521000)
        };
        
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName));
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())
                .thenComparing(Employee::getName, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(employees));
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

