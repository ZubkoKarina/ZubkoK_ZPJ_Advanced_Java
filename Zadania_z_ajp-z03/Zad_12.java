import java.io.File;
import java.io.FilenameFilter;

public class FilterFilesWithExtension {
    public static void main(String[] args) {
        File directory = new File("your_directory");
        String extension = ".txt";
        
        String[] files = directory.list((dir, name) -> name.endsWith(extension));
        System.out.println(Arrays.toString(files));
    }
}

