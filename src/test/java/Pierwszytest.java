import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pierwszytest {
    @Test
    public void test1(){
        DriverManager.createInstance();
        WebDriver driver = DriverManager.getWebDriver();
        driver.get("https:www.allegro.pl");
    }
}
