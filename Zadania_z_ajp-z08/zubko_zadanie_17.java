import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class zubko_zadanie_17{
    public static void main(String[] args) {
        String text = "War and Peace is a historical novel by the Russian author Leo Tolstoy. It is considered one of the greatest works of world literature and has been widely acclaimed for its complex characters, intricate plot, and detailed portrayal of Russian society during the Napoleonic era. The novel explores themes of war, love, fate, and the nature of human existence. Set against the backdrop of the French invasion of Russia, War and Peace follows the lives of several interconnected Russian aristocratic families as they navigate through the tumultuous events of the early 19th century.";
        Stream<String> lines = Arrays.stream(text.split("\n")).parallel();
        lines.sorted(Comparator.comparingInt(String::length).reversed()).limit(500).forEach(System.out::println);
    }
}
