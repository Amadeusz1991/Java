package drivers;

public class WebdriverTest {
    public static void main(String[] args) {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        fireFoxDriver.get();
        fireFoxDriver.findElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        }else if(name.equals("firefox")) {
            return new FireFoxDriver();
        }
        return null;

    }


}
