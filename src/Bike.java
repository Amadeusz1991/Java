public class Bike implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("jadę rowerem z prędkością 50km/h" + speed);

    }

    @Override
    public void stop() {
        System.out.println(" Hamuje rowerem do 0km/h");

    }

    @Override
    public String info() {
        return "Rower";
    }

}
