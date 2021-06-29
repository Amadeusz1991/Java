import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie1 { // Operacja dwóch wartości z wykorzystaniem operatorów matematycznych
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DODAWANIE");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner2.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = secondNumber % firstNumber;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + substraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wunik modulo: " + modulo);



    }
}
