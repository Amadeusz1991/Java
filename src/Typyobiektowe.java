public class Typyobiektowe {

    public static void main(String[] args) {
        //liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 327668999; // 4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63) -1

        // liczby zmienno przecinkowe
        Float fiftNumber = 4.99934F; // 4 bajty
        Double sixthNumber = 3.999999999999999D; // 8 bajtów

        //Wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        //Pojedynczy znak
        Character letter = 'A';

        //ciągi znaków
        String hello = "Hello";
        System.out.println(hello.charAt(0));
    }
}
