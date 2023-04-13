import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("hello", "world", "java", "stream");

        DoubleSummaryStatistics statistics = stringStream.mapToInt(String::length).summaryStatistics();
        double averageLength = statistics.getAverage();

        System.out.println("Average length: " + averageLength);
    }
}

