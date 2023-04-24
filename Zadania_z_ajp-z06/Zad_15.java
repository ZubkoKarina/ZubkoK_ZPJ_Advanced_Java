import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Zad_15 {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Optional<Double> sumAndCount = numbers.stream()
                .map(x -> new double[]{x, 1})
                .reduce((a, b) -> new double[]{a[0] + b[0], a[1] + b[1]});
        if (sumAndCount.isPresent()) {
            double[] result = sumAndCount.get();
            double average = result[0] / result[1];
            System.out.println("Average value: " + average);
        } else {
            System.out.println("Empty array: ");
        }
    }
}
