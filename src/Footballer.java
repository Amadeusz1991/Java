public class Footballer extends Person{

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }
    public void eat(){
        System.out.println("I like healthy food");
    }
    public void walk() {
        super.walk();/*Po nadpisaniu metody ndrzędnej, można i tak wywołać metodę nadrzędna aby została uzyta tutaj
        W ten sposób jest wywołana najpier metoda nadrzędna za pomocą "super" a potem to co poniżej*/
        System.out.println("I like running!");
    }

    public void playFootball(){
        System.out.println("I'm playing football" + footballClub);
    }

}
