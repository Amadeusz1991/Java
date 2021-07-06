package identifiers.first;

public class Child extends Parent {
    // Klasa potomna w tej samej paczce do pól/metod  private
    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethond();
        secondMethond();
        thirdMethond();
        //fourthMethond();
    }
}
