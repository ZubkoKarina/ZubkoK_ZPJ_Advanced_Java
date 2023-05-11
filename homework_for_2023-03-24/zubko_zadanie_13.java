import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class zubko_zadanie_13 {
    public static void main(String[] args) {
        File[] files = new File(".").listFiles();
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getName));
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
