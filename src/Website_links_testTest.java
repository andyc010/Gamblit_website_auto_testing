import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


class Website_links_testTest {


    @Test
    void logo_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement gamblit_logo_image_link = browser.findElement(By.className("logo"));
            gamblit_logo_image_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void GLI_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement GLI_image_link = browser.findElement(By.partialLinkText("gaminglabs"));
            GLI_image_link.click();
            Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void about_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement about_link = browser.findElement(By.linkText("ABOUT"));
            about_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void developers_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement developers_link = browser.findElement(By.linkText("DEVELOPERS"));
            developers_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void operators_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement operators_link = browser.findElement(By.linkText("OPERATORS"));
            operators_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void games_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement games_link = browser.findElement(By.linkText("GAMES"));
            games_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void news_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement news_link = browser.findElement(By.linkText("NEWS"));
            news_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void contact_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com/");
            WebElement contact_link = browser.findElement(By.linkText("CONTACT"));
            contact_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void responsible_gaming_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement responsible_gaming_link = browser.findElement(By.partialLinkText("Responsible"));
            responsible_gaming_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void careers_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement careers_link = browser.findElement(By.partialLinkText("Careers"));
            careers_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void facebook_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement facebook_image_link = browser.findElement(By.partialLinkText("Facebook"));
            facebook_image_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void twitter_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement twitter_image_link = browser.findElement(By.partialLinkText("Twitter"));
            twitter_image_link.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    @Test
    void another_link_works() {
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement facebook = browser.findElement(By.partialLinkText("another"));
            facebook.click();
            //Thread.sleep(5000);
            browser.quit();
        }
        catch (Exception e) {

        }
    }

    // does not work
    /*@Test
    void about_team_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        about_link.click();
        WebElement team_link = browser.findElement(By.partialLinkText("team"));
        team_link.click();
        browser.quit();
    }

    @Test
    void about_careers_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement about_link = browser.findElement(By.partialLinkText("Careers"));
        about_link.click();
        browser.quit();
    }

    @Test
    void about_where_to_play_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "/Users/andy/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement about_link = browser.findElement(By.partialLinkText("where-to-play"));
        about_link.click();
        browser.quit();
    }*/
}