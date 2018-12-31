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
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Announcements"));
        category_dropdownitem_Announcements.click();
        // assert statement here...
        Assertions.assertEquals("https://gamblitgaming.com/blog/categories/announcements", browser.getCurrentUrl(), "URLs for News: Announcements page do not match!");
    }

    @Test
    void categories_dropdown_option_events_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Events"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
        Assertions.assertEquals("https://gamblitgaming.com/blog/categories/events", browser.getCurrentUrl(), "URLs for News: Events page do not match!");
    }

    @Test
    void categories_dropdown_option_press_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Press"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
        Assertions.assertEquals("https://gamblitgaming.com/blog/categories/press", browser.getCurrentUrl(), "URLs for News: Press page do not match!");
    }

    @Test
    void categories_dropdown_option_uncategorized_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement categoryDropdownlist = browser.findElement(By.id("cat-dropdown"));

        // click on the Category dropdown button...
        categoryDropdownlist.click();

        // click on an option...
        WebElement category_dropdownitem_Announcements = browser.findElement(By.partialLinkText("Uncategorized"));
        category_dropdownitem_Announcements.click();

        // assert statement here...
        Assertions.assertEquals("https://gamblitgaming.com/blog/categories/uncategorized", browser.getCurrentUrl(), "URLs for News: Uncategorized page do not match!");
    }

    @Test
    void archives_dropdown_works()
    {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement archivesDropdownlist = browser.findElement(By.id("archives-dropdown"));
        archivesDropdownlist.click();

        // assert statement here...
        Assertions.assertEquals("https://gamblitgaming.com/blog/", browser.getCurrentUrl(), "URLs for News w/Archives page do not match!");
    }
    
    // TODO: need to edit this test to perhaps test more than one date/page
    @Test
    void archives_dropdown_option_works(){
        String monthtext = "April";
        int yeartext = 2016;
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement archivesDropdownlist = browser.findElement(By.id("archives-dropdown"));
        archivesDropdownlist.click();

        WebElement archivesOption = browser.findElement(By.partialLinkText(monthtext + " " + Integer.toString(yeartext)));
        archivesOption.click();

        Assertions.assertEquals("https://gamblitgaming.com/blog/2016/04", browser.getCurrentUrl(), "URLs for News from 11/2013 page do not match!");
    }

    @AfterEach
    void tearDown() {
        browser.quit();
    }
}
