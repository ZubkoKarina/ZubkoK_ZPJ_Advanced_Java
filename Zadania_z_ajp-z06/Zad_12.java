import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;

public class Zad_12 {
    public static void main(String[] args) {
        // Тестирование метода isFinite
    }

    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T> spliterator = stream.spliterator();
        return (spliterator.characteristics() & Spliterator.SIZED) != 0;
    }
}
