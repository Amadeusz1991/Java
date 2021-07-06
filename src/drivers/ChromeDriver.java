package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otiweram przeglądarke chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję emelemt w przeglądarce chrome");

    }
}
