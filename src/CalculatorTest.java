import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorTest { // Operacja dwóch wartości z wykorzystaniem operatorów matematycznych
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DODAWANIE");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner2.nextInt();

        Calculator calculator = new Calculator();


        int addition = calculator.add(firstNumber,secondNumber);
        int substraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mult(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int modulo = calculator.modul(firstNumber,secondNumber);

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + substraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wunik modulo: " + modulo);



    }
}
