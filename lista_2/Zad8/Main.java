import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//zadanie 8
class DigitSequence implements Iterator<Integer> {
    private int number;
    public DigitSequence(int number) {
        this.number = number;
    }
    @Override
    public boolean hasNext() {
        return number != 0;
    }
    @Override
    public Integer next() {
        int result = number % 10;
        number /= 10;
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Iterator<Integer> digitSequence = new DigitSequence(12345);
        while (digitSequence.hasNext()) {
            System.out.print(digitSequence.next() + " ");
        }
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("Scala");
        strings.add("Kotlin");
        luckySort(strings, String::compareTo);
        System.out.println("\nSorted: " + strings);
    }
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean sorted;
        do {
            Collections.shuffle(strings);
            sorted = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    sorted = false;
                    break;
                }
            }
        } while (!sorted);
    }
}
