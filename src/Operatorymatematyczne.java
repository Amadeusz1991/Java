public class Operatorymatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subsctration = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber; // ile razy 6 miesci się w 4

        System.out.println("Dodawanie" + addition);
        System.out.println("Odejmowanie" + subsctration);
        System.out.println("Mnożenie" + multiplication);
        System.out.println("Dzielenie" + division);
        System.out.println("Modulo" + mod);

        //Nadpisywanie zmiennej, która pokazuje wynik działania
        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber);
        firstNumber/=secondNumber; // firstNumber/secondNumber
        System.out.println("Po dzieleniu: " + firstNumber);
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber);


    }
}
