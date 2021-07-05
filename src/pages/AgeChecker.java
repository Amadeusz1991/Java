package pages;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        if(age < 18 && age >=0 ) {
            System.out.println("Nie można ci sprzedać alkoholu");
        }else if(age < 0) {
            System.out.println("Wprowadź poprawną wartość");
        }else {
            System.out.println("Dziękuje za zakupy w moim sklepie");
        }
    }
}
