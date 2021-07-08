package files;

import java.io.File;
import java.io.IOException;

public class CreateFiles {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (file.createNewFile()){
            System.out.println("Stworzyłęm nowy plik");
        }else
            System.out.println("Plik już istnieje");
    }
}
