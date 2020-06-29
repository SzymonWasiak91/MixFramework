import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class Methods {

    WebDriver driver = DriverManager.getWebDriver();

    public void Methods(){
        this.driver = driver;
    }

    public void waitForVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10 );
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void waitForClicable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitFroListElements(List<WebElement> elementList){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.until(driver->elementList.size()>0);

    }
    public static String takeScreeanShot(WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screneShotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/screenShots" + LocalTime.now().getNano() + ".png");
        Files.copy(screneShotFile.toPath(),destinationFile.toPath());
        return destinationFile.getAbsolutePath();
    }
}
