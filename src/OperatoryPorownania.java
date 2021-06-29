import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner2.nextInt();


        boolean result = secondNumber > firstNumber;
        System.out.println(result);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
    }
}
