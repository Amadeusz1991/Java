import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Wybierz danie jakie cie interesuje: ");
        String danie = "Pizza";


        switch (danie) {
            case "Pizza":
                System.out.println("cena to 22 złote");
                break;
            case "Losos":
                System.out.println("Cena to 35 złote");
                break;
            case "Frytki":
                System.out.println("Cena to 9 złotych");
                break;
            default:
                System.out.println("Nie mamy takiego dania w karcie");
        }
    }
}
