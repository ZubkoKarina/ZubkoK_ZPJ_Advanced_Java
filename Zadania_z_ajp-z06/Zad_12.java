import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.List;
import java.util.ArrayList;

public class Zad_12 {
    public static void main(String[] args) {
        Stream<Integer> finiteStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
        System.out.println("isFinite(finiteStream): " + isFinite(finiteStream));
        List<String> list = new ArrayList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        Stream<String> listStream = list.stream();
        System.out.println("isFinite(listStream): " + isFinite(listStream)); 
    }
    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T> spliterator = stream.spliterator();
        return (spliterator.characteristics() & Spliterator.SIZED) != 0;
    }
}
