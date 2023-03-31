import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("war_and_peace.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(content.split("\\PL+"));
        long start = System.currentTimeMillis();
        long count1 = words.stream().filter(w -> w.length() > 12).count();
        long end = System.currentTimeMillis();
        System.out.println("stream duration: " + (end - start) + " ms");
        System.out.println("long words count: " + count1);
        start = System.currentTimeMillis();
        long count2 = words.parallelStream().filter(w -> w.length() > 12).count();
        end = System.currentTimeMillis();
        System.out.println("parallelStream duration: " + (end - start) + " ms");
        System.out.println("long words count: " + count2);
    }
}

