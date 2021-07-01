public class StudentChecker {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.imie = "Angel";
        student1.nazwisko = "Mrozowski";
        student1.numerId = 1;
        student1.nickname = "amrozowski";
        student1.email = "amrozowski@wp.pl";

        Student student2 = new Student();
        student2.imie = "Krystian";
        student2.nazwisko = "Jankowski";
        student2.numerId = 2;
        student2.nickname = "kJankowski";
        student2.email = "kjankowski@wp.pl";

        Student student3 = new Student();
        student3.imie = "Marek";
        student3.nazwisko = "Kowalski";
        student3.numerId = 3;
        student3.nickname = "mkowalski";
        student3.email = "mkowalski@wp.pl";

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for(int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podanNrid();
            students[i].zalogujSie();
        }

    }
}
