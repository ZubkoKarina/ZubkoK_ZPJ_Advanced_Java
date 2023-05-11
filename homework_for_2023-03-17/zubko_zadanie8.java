import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class zubko_zadanie8 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> sortedStrings = new ArrayList<>(strings);
        sortedStrings.sort(comp);

        while (!strings.equals(sortedStrings)) {
            Collections.shuffle(strings);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Jeleń"); 
        strings.add("Słońce"); 
        strings.add("Motyl"); 
        strings.add("Wąż"); 
        strings.add("Koń"); 
        strings.add("Kot"); 
        luckySort(strings, String::compareTo);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
