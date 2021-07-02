import java.util.logging.SocketHandler;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;
    public String kolor;

    public Auto(String marka, String model, int rok, int przebieg, String kolor ){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.kolor = kolor;
    }

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
