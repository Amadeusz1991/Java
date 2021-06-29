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
        int result = firstNumber + secondNumber;
        System.out.println("Suma tych dwóch liczb to: " + result);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("ODEJMOWANIE");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber3 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber4 = scanner4.nextInt();
        int result2 = firstNumber3 - secondNumber4;
        System.out.println("róznica tych dwóch liczb to: " + result2);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("MNOŻENIE");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber5 = scanner5.nextInt();
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber6 = scanner6.nextInt();
        int result3 = firstNumber5 * secondNumber6;
        System.out.println("Iloczyn tych dwóch liczb to: " + result3);

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("DZIELENIE");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber7 = scanner7.nextInt();
        Scanner scanner8 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber8 = scanner8.nextInt();
        int result4 = firstNumber7 / secondNumber8;
        System.out.println("Iloraz tych dwóch liczb to: " + result4);

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("MODULO");
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber9 = scanner9.nextInt();
        Scanner scanner10 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber10 = scanner10.nextInt();
        int result5 = firstNumber9 % secondNumber10;
        System.out.println("Modulo tych dwóch liczb to: " + result5);

    }
}
