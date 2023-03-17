import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T min(T... items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Items cannot be empty.");
        }
        T minValue = items[0];
        for (T item : items) {
            if (item.compareTo(minValue) < 0) {
                minValue = item;
            }
        }
        return minValue;
    }
    public static <T extends Comparable<T>> T max(T... items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Items cannot be empty.");
        }
        T maxValue = items[0];
        for (T item : items) {
            if (item.compareTo(maxValue) > 0) {
                maxValue = item;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 2);
        Complex c3 = new Complex(3, 3);
        Complex minComplex = min(c1, c2, c3);
        Complex maxComplex = max(c1, c2, c3);
        System.out.println("Min Complex: " + minComplex);
        System.out.println("Max Complex: " + maxComplex);
    }
}
class Complex implements Comparable<Complex> {
    int real;
    int imaginary;
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    @Override
    public int compareTo(Complex other) {
        // Implement comparison logic for Complex class
        int thisMagnitude = this.real * this.real + this.imaginary * this.imaginary;
        int otherMagnitude = other.real * other.real + other.imaginary * other.imaginary;

        return Integer.compare(thisMagnitude, otherMagnitude);
    }
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
