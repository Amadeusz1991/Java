import drivers.ChromeDriver;
import drivers.FireFoxDriver;
import drivers.WebDriver;

public class ExceptionsExamples {
    public static void main(String[] args) {

        /*int[] mnumbers = new int[2];
        mnumbers[0] = 1;
        mnumbers[1] = 2;

        for(int i=0; i < mnumbers.length; i++){
            System.out.println(mnumbers[i]);
        }*/

        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
        private static WebDriver getDriver (String name){
            if (name.equals("chrome")) {
                return new ChromeDriver();
            } else if (name.equals("firefox")) {
                return new FireFoxDriver();
            }
            return null;
        }
    }

