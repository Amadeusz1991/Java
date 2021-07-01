public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2020;
        mercedes.przebieg = 1000;
        mercedes.kolor = "Bialy";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto Honda = new Auto();
        Honda.marka = "Honda";
        Honda.model = "Civic";
        Honda.rok = 2004;
        Honda.przebieg = 10000;
        Honda.kolor = "Zielony";

        Honda.info();
        Honda.jedz();
        Honda.hamuj();
    }
}
