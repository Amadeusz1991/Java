package Lists;

import Document.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Paweł");
        name.add("Kasia");
        name.add("Piotr");
        name.add("Paweł");

        /*System.out.println(name.get(1));
        System.out.println(name.indexOf("Paweł"));
        System.out.println(name.lastIndexOf("Paweł"));
        System.out.println(name.contains("Kasia"));
        System.out.println(name.size());
        System.out.println(name.isEmpty());

        List<Integer> number = new LinkedList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        System.out.println(number.get(1));
        System.out.println(number.indexOf(2));
        System.out.println(number.lastIndexOf(4));
        System.out.println(number.contains(2));
        System.out.println(number.size());
        System.out.println(number.isEmpty());

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(name);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());*/

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        for (String names : name) {
            System.out.println(names);
        }
    }
}

