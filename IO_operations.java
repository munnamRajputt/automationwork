import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IO_operations {

    public static void main(String[] args) throws IOException {


        //Task2 - Part 1 Creates a New-file & check either its already exist or not
        File abc = new File("src/file.txt");
        System.out.println(abc.exists());
        System.out.println(abc.createNewFile());

        //Task2 - Part2 Copy a file form one location to another
        Path src = Paths.get("src/file.txt");
        Path dest = Paths.get("src/output-file/");
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);

        //Task 2 - Part 3 Create file in different directory of project & mac as well : Change mrajputt to own directory name as per req
        File abcd = new File("/Users/mrajputt/Desktop/file_1.txt");
        System.out.println(abcd.exists());
        System.out.println(abcd.createNewFile());
        File abcde = new File("src/new/file_2.txt");
        System.out.println(abcde.exists());
        System.out.println(abcde.createNewFile());
    }

}