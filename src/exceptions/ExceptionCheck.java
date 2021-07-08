package exceptions;

import java.util.Scanner;

public class ExceptionCheck {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swój wiek:");
        int age = scanner.nextInt();

        if (age < 0 ){
            throw new InvalidAgeException("Number is not valid");
        }
        if (age > 18){
            System.out.println("Jesteś pełnoletni!");
        }else
            System.out.println("Jesteś gówniarzem");
    }
}
