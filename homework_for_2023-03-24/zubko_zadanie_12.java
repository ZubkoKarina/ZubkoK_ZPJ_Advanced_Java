import java.io.File;
import java.io.FilenameFilter;

public class zubko_zadanie_12 {
    public static void main(String[] args) {
        File directory = new File(".");
        String extension = ".txt"; 
        File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
