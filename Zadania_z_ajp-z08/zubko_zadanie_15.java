import java.util.Arrays;
import java.util.stream.Stream;

public class zubko_zadanie_15 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        double sum = stream.reduce(0.0, Double::sum);
        stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        long count = stream.count();
        double average = sum / count;
        System.out.println(average);
    }
}
