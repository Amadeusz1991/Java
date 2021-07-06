public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką z prędkością 50km/h" + speed);
    }

    @Override
    public void stop() {
        System.out.println(" Hamuję cieżarówka do 0km/h");
    }

    @Override
    public String info() {
        return "Ciężarówka";
    }
    public void zatankuj(){
        System.out.println("Aby można było jechać trzeba zatankować");
    }
}
