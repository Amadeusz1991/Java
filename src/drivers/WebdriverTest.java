package drivers;

public class WebdriverTest {
    public static void main(String[] args) throws NoValidBrowserName {
        WebDriver driver = getDriver("firefoxa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        }else if(name.equals("firefox")) {
            return new FireFoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");

    }


}
