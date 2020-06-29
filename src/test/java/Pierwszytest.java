import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Pierwszytest {
    @Test
    public void test1() throws IOException {
        DriverManager.createInstance("firefox");
        WebDriver driver = DriverManager.getWebDriver();

        driver.get("https:www.allegro.pl");
        Methods.takeScreeanShot(driver);
    }
}
