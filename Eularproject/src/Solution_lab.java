import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.*;
/**
 *
 * @author Archit
 */
public class Solution_lab {
    public static void main(String[] args){
        File file = new File("/");
        String[] directories = file.list(new FilenameFilter() {
        @Override
        public boolean accept(File current, String name) {
          return new File(current, name).isDirectory();
        }
      });
        System.out.println(Arrays.toString(directories));
        List<String> results = new ArrayList<String>();
        File testDirectory = new File("/");
        File[] files = testDirectory.listFiles(new FileFilter() {
        @Override
        public boolean accept(File pathname) {
        String name = pathname.getName().toLowerCase();
        return name.endsWith(".java") && pathname.isFile();
        }
    });
        System.out.println((results));
        List<String> result = new ArrayList<String>();
        File[] files1 = testDirectory.listFiles(new FileFilter() {
        @Override
        public boolean accept(File pathname) {
        String name = pathname.getName().toLowerCase();
        return name.endsWith(".class") && pathname.isFile();
        }
    });
        System.out.println((result));
    }
}
