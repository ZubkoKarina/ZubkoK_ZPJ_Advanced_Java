import java.util.Arrays;
import java.util.Comparator;

public class zubko_zadanie_15 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Zubko", 435634),
                new Employee("Innov", 6345),
                new Employee("Boniyk", 504545),
                new Employee("Vasilienko", 64530)
        };
        Arrays.sort(employees, Comparator
                .comparing(Employee::getSalary)
                .thenComparing(Employee::getSurname));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
        Arrays.sort(employees, Comparator
                .comparing(Employee::getSalary).reversed()
                .thenComparing(Employee::getSurname).reversed());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    static class Employee {
        private String surname;
        private int salary;
        public Employee(String surname, int salary) {
            this.surname = surname;
            this.salary = salary;
        }
        public String getSurname() {
            return surname;
        }
        public int getSalary() {
            return salary;
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
