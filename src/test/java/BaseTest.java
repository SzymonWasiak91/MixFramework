import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {



    @BeforeMethod
    public void setUp(){
    DriverManager.createInstance("chrome");
    WebDriver driver = DriverManager.getWebDriver();
    driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
    DriverManager.getWebDriver().quit();
    }
}
