import java.util.Arrays;
import java.util.stream.Stream;

public class zubko_zadanie_1 {
    public static void main(String[] args) {
        String text = "Carpe diem, quam minimum credula postero";
        Stream<String> words = Arrays.stream(text.split(" "));
        words.filter(word -> {
            if (word.length() > 5) {
                System.out.println("filter for: " + word);
                return true;
            } else {
                return false;
            }
        }).limit(5).forEach(System.out::println);
    }
}
