package identifiers.second;

import identifiers.first.Parent;

public class Random {
    public void testIdentifier() {
        // // Klasa w tej samej paczce nie ma dostepu pól/metod private, default i protected.
        Parent parent = new Parent();
        // Klasa w tej samej paczce nie ma dostepu pól/metod private
        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstMethond();
        //parent.secondMethond();
        //parent.thirdMethond();
        //parent.fourthMethond();
    }
}
