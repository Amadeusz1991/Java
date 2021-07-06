package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    // klasa potomna w innej paczce nie ma dostępu do pól/metod private i default.
    public void  testIdentifiers(){

        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethond();
        //secondMethond();
        thirdMethond();
        //fourthMethond();
    }
}
