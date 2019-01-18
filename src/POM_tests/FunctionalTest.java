import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    /* using information provided in the website:
        https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests
    */
    protected static WebDriver driver;
    static final String driverKey = "webdriver.chrome.driver";

    @BeforeAll
    static void setUp1(){
        System.setProperty(driverKey, SeleniumSettings.CHROME_DRIVER_PATH);
    }

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
