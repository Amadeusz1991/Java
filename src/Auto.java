import java.util.logging.SocketHandler;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;
    public String kolor;

    public void jedz(){
        System.out.println("Jedz!");
    }
    public void hamuj(){
        System.out.println("Hamuj");
    }
    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("rok: " + rok);
        System.out.println("przebieg: " + przebieg);
        System.out.println("kolor: " + kolor);
    }
}
