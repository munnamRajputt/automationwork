import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {

    //Task1 - PART 2 & 3 (BufferReader + try-withResources)

    public static void main(String[] args) throws IOException {

        tryResources();
    }

    static String tryResources() throws IOException {
        try (FileReader fr = new FileReader("src/123.txt");
             BufferedReader br = new BufferedReader(fr)) {
            System.out.println(br.readLine());
            return br.readLine();

        }
    }

}
