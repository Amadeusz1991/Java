public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2020, 100, "Biały");
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto Honda = new Auto("Honda", "Civic", 2004, 10000, "Zielony");
        Honda.info();
        Honda.jedz();
        Honda.hamuj();
    }
}
