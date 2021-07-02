public class Student {

    public String imie;
    public String nazwisko;
    public String nickname;
    public String email;
    public Integer numerId;
    public static String nazwaUczelni = "AGH po zmianie";

    public void przedstawSie(){
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje sie za pomocą: " + nickname);
    }
    public void podanNrid() {
        System.out.println("Mój numer indeksu to: " + numerId);
    }
    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    public static void infoUczelnia(){

        System.out.println("Moja uczelnia to: " + nazwaUczelni);
    }
}
