import java.util.Arrays;
import java.util.List;

public class zubko_zadanie_2 {
    public static void main(String[] args) {
        String text = "Carpe diem, quam minimum credula postero";
        List<String> words = Arrays.asList(text.split(" "));
        long startParallel = System.currentTimeMillis();
        long countParallel = words.parallelStream().filter(word -> word.length() > 5).count();
        long endParallel = System.currentTimeMillis();
        long startStream = System.currentTimeMillis();
        long countStream = words.stream().filter(word -> word.length() > 5).count();
        long endStream = System.currentTimeMillis();
        System.out.println("parallel count: " + countParallel + ", time: " + (endParallel - startParallel) + " ms");
        System.out.println("stream count: " + countStream + " , time: " + (endStream - startStream) + " ms");
    }
}
