import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySortDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Piotr", "Paweł", "Maria", "Anna"));
        luckySort(strings, String::compareTo);
        System.out.println(strings);
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> sorted = new ArrayList<>(strings);
        sorted.sort(comp);

        while (!strings.equals(sorted)) {
            Collections.shuffle(strings);
        }
    }
}

