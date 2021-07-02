public class UserTest {
    public static void main(String[] args) {

        User user = new User("Amades", "hello");
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
