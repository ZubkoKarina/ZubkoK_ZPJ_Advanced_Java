import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Subdirectories {
    public static void main(String[] args) {
        File directory = new File("your_directory");
        
        File[] subdirectories = directory.listFiles(file -> file.isDirectory());
        System.out.println(Arrays.toString(subdirectories));
        
        File[] subdirectories2 = directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        System.out.println(Arrays.toString(subdirectories2));
    }
}

