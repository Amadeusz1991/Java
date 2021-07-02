public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 12;
        teacher.school = "UN";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teacherMath();


        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 42;
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
        footballer.footballClub = "Chelsea";
    }
}
