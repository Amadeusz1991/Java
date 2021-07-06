package identifiers.first;

public class Random {
    public void testIdentifier(){
        Parent parent = new Parent();
        // Klasa w tej samej paczce nie ma dostepu pól/metod private
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethond();
        parent.secondMethond();
        parent.thirdMethond();
        //parent.fourthMethond();
    }
}
