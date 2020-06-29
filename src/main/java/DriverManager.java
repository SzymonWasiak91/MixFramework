import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    public static WebDriver getWebDriver() {
        return webDriver.get();
    }

    public static void setWedrier(WebDriver driver) {
        webDriver.set(driver);
    }

    public static void createInstance(String browserName) {
//        if(System.getProperty("webdriver.chrome.driver")==null){
//            File iDriver = new File(System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
//            System.setProperty("webdriver.chrome.driver",iDriver.getAbsolutePath());
//
//        }
//        setWedrier(new ChromeDriver());
        setWedrier(DriverFactory.createDriverInstance(browserName));
    }
}
