//zad 1-2
public interface Measurable {
    double getMeasure();
}

public class Employee implements Measurable {
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
    public double getMeasure() {
        return salary;
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;
    }
}
//zad 3
/*
 * Rodzaj nadrzędny dla String, Scanner i ImageOutputStream:
 * String: Rodzaj nadrzędny dla String to klasa Object.
 * Scanner: Rodzaj nadrzędny dla Scanner to klasa Object.
 * ImageOutputStream: Rodzaj nadrzędny dla ImageOutputStream 
 * to interfejs ImageOutputStream. Jego rodzaj nadrzędny to 
 * interfejs ImageInputStream, który z kolei ma rodzaj nadrzędny 
 * AutoCloseable. Ostatecznie, wszystkie mają rodzaj nadrzędny Object.
 */