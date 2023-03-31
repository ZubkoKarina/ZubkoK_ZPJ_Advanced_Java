import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SortFilesAndDirectories {
    public static void main(String[] args) {
        File[] filesAndDirectories = new File("your_directory").listFiles();
        
        Arrays.sort(filesAndDirectories, Comparator.comparing(File::isFile)
                .thenComparing(File::getName));
        
        System.out.println(Arrays.toString(filesAndDirectories));
    }
}

