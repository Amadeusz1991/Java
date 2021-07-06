package drivers;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę FireFox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w FireFox");

    }
}
