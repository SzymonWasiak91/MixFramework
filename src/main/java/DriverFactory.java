import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class DriverFactory {

    public static WebDriver createDriverInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            if (System.getProperty("webdriver.chrome.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", iDriver.getAbsolutePath());
                driver = new ChromeDriver();

            }
        }
        if (browserName.equalsIgnoreCase("firefox")) {
            if (System.getProperty("webdriver.gecko.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", iDriver.getAbsolutePath());
                driver = new FirefoxDriver();

            }
        }
        if (browserName.equalsIgnoreCase("opera")) {
            if (System.getProperty("webdriver.opera.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/drivers/operadriver.exe");
                System.setProperty("webdriver.opera.driver", iDriver.getAbsolutePath());
                driver = new OperaDriver();

            }
        }
        return driver;
    }
}
