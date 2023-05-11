import java.util.OptionalDouble;
import java.util.stream.Stream;

public class zubko_zadanie_15 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(average(stream)); 
    }

    public static OptionalDouble average(Stream<Double> stream) {
        return stream.mapToDouble(Double::doubleValue).average();
    }
}
