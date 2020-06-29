import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AllegroTest extends BaseTest {
    @Test
    public void test1 () throws IOException {

        WebDriver driver = DriverManager.getWebDriver();
        driver.get("https:www.allegro.pl");
        Methods.takeScreeanShot(driver);
    }
}
