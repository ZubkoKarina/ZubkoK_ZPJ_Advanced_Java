import java.io.File;
import java.io.FileFilter;

public class zubko_zadanie_11{
    public static void main(String[] args) {
        File directory = new File(".");
        File[] subdirectories = directory.listFiles(File::isDirectory);

        for (File subdirectory : subdirectories) {
            System.out.println(subdirectory.getName());
        }
    }
}
