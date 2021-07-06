public class FinalTest {
    public static void main(String[] args) {

        final int x = 21;
        final Person person = new Person("tim", 26);
        person.age = 40;

        /* używając final przy klasach lub polach, uniemożliwiamy zmianę wartości przypisanej
        i nie możemy dziedziczyć takiej klasu lub metody do innych klas.*/
    }
}
