import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student adam = new Student();
        adam.imie = "Angel";
        adam.nazwisko = "Mrozowski";
        adam.numerId = 1;
        adam.nickname = "amrozowski";
        adam.email = "amrozowski@wp.pl";
        String uczelniaAdama = adam.nazwaUczelni;

        Student kasia = new Student();
        kasia.imie = "Krystian";
        kasia.nazwisko = "Jankowski";
        kasia.numerId = 2;
        kasia.nickname = "kJankowski";
        kasia.email = "kjankowski@wp.pl";

        Student piotr = new Student();
        piotr.imie = "Marek";
        piotr.nazwisko = "Kowalski";
        piotr.numerId = 3;
        piotr.nickname = "mkowalski";
        piotr.email = "mkowalski@wp.pl";

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] = piotr;

        for(int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podanNrid();
            students[i].zalogujSie();
        }


    }
}
