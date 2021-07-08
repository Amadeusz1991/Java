import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\ajankows\\Desktop\\Java\\src\\test.txt");
            //System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Closing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
