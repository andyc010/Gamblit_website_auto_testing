import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.*;

public class news_dropdowns_test {
    WebDriver browser;
    static final String chromeDriverKey = "webdriver.chrome.driver";
    // changed the following to put the actual string in a separate file & class due to git
    static final String chromeDriverValue = SeleniumSettings.CHROME_DRIVER_PATH;
    static final String homePage = "https://www.gamblitgaming.com/blog/";

    @BeforeAll
    static void setup() {
        System.setProperty(chromeDriverKey, chromeDriverValue);
    }

    @BeforeEach
    void setup2() {
        browser = new ChromeDriver();
    }

    @Test
    void categories_dropdown_option_announcements_works() {
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Announcements"));
        category_dropdownitem_Announcements.click();
        // assert statement here...
    }

    @Test
    void categories_dropdown_option_events_works() {
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Events"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
    }

    @Test
    void categories_dropdown_option_press_works() {
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Press"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
    }

    @Test
    void categories_dropdown_option_uncategorized_works() {
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Uncategorized"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
    }

    @Test
    void archives_dropdown_works()
    {
        browser.get(homePage);
        WebElement archivesDropdownlist = browser.findElement(By.id("archives-dropdown"));
        archivesDropdownlist.click();

        // assert statement here...
    }

    @AfterEach
    void tearDown() {
        browser.quit();
    }

    /*String monthtext = "September";
    int yeartext = 2015;

    @Test
    void archives_dropdown_option_works(int year, String month){
        browser = new ChromeDriver();
        browser.get(homePage);
        WebElement archivesDropdownlist = browser.findElement(By.id("archives-dropdown"));
        archivesDropdownlist.click();

        WebElement archivesOption = browser.findElement(By.partialLinkText(month + " " + Integer.toString(year)));
        archivesOption.click();
        browser.quit();
    }*/
}
