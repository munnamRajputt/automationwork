import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOStream {

    //Task-1 Part_1 Read Console Input Using Scanner
    public static void main(String[] args) throws Exception {
        IOStream io = new IOStream();
        io.fileReader();

    }

    public void fileReader() throws FileNotFoundException {
        File fs = new File("src/abc.txt");
        Scanner myReader = new Scanner(fs);

        while(myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}
