public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 12, "UN");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teacherMath();


        Footballer footballer = new Footballer("Mike", 42, "Chelsea");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();

    }
}
