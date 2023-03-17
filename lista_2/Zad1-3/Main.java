//zadanie 1
interface Measurable {
    double getMeasure();
}
class Employee implements Measurable {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double getMeasure() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            throw new IllegalArgumentException("Objects array cannot be empty.");
        }
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
    //zadanie 2
    public static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            throw new IllegalArgumentException("Objects array cannot be empty.");
        }
        Measurable largestObject = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largestObject.getMeasure()) {
                largestObject = obj;
            }
        }
        return largestObject;
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Karina", 50000),
                new Employee("Zubko", 60000),
                new Employee("Alina", 45555),
                new Employee("Zolo", 55222)
        };
        double averageSalary = average(employees);
        System.out.println("Average salary: " + averageSalary);
        //zadanie 2
        Employee highestPaidEmployee = (Employee) largest(employees);
        System.out.println("Employee with the highest salary: " + highestPaidEmployee.getName() + " with a salary of " + highestPaidEmployee.getSalary());
    }
}

//zadanie 3  
   /* W podanym kodzie interfejs Measurable nie ma zadeklarowanego supertypu, 
    * a klasa Employee implementuje interfejs Measurable.
    *
    * Zgodnie z zasadami języka Java, jeśli klasa lub interfejs nie deklaruje 
    * jawnie supertypu, automatycznie otrzymuje Object jako swój supertyp. 
    * Dotyczy to klas, które nie rozszerzają innych klas oraz interfejsów, 
    * które nie rozszerzają innych interfejsów.*/
