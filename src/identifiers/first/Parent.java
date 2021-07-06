package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected  String third = "potected";
    private String fourth = "private";

    public void firstMethond(){
        System.out.println("public");
    }
    void secondMethond(){
        System.out.println("default");
    }
    public void thirdMethond(){
        System.out.println("protected");
    }
    public void fourthMethond(){
        System.out.println("private");
    }

    public void testIdentifiers(){

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethond();
        secondMethond();
        thirdMethond();
        fourthMethond();
    }
}
