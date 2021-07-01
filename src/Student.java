public class Student {

    public String imie;
    public String nazwisko;
    public String nickname;
    public String email;
    public Integer numerId;

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
}
