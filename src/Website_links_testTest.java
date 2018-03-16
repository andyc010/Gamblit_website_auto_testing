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


class Website_links_testTest {


    @Test
    void logo_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement gamblit_logo_image_link = browser.findElement(By.className("logo"));
        gamblit_logo_image_link.click();
        browser.quit();
    }

    @Test
    void GLI_link_works() {
        // this works when using a workaround of using Thread.sleep(), but doesn't work when going without it
        WebDriver browser;

        try {
            System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
            browser = new ChromeDriver();
            browser.get("https://www.gamblitgaming.com");
            WebElement GLI_image_link = browser.findElement(By.xpath("//img[@ src='/assets/images/glc-badge.jpg']"));
            GLI_image_link.click();
            Thread.sleep(5000);
            //browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            browser.quit();
        } catch (Exception e) {

        }

    }

    @Test
    void about_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        about_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void developers_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement developers_link = browser.findElement(By.linkText("DEVELOPERS"));
        developers_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void operators_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement operators_link = browser.findElement(By.linkText("OPERATORS"));
        operators_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void games_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement games_link = browser.findElement(By.linkText("GAMES"));
        games_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void news_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement news_link = browser.findElement(By.linkText("NEWS"));
        news_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void contact_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");
        WebElement contact_link = browser.findElement(By.linkText("CONTACT"));
        contact_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void responsible_gaming_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement responsible_gaming_link = browser.findElement(By.partialLinkText("Responsible"));
        responsible_gaming_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void careers_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement careers_link = browser.findElement(By.partialLinkText("Careers"));
        careers_link.click();

        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void facebook_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement facebook_image_link = browser.findElement(By.partialLinkText("Facebook"));
        facebook_image_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void twitter_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement twitter_image_link = browser.findElement(By.partialLinkText("Twitter"));
        twitter_image_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Disabled
    void another_link_works() {
        // don't know why I have this test
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com");
        WebElement facebook = browser.findElement(By.partialLinkText("another"));
        facebook.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void about_team_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement team_link = browser.findElement(By.partialLinkText("TEAM"));
        //WebElement team_link = browser.findElement(By.xpath("//html/body/header/div[2]/div/nav/ul/li[1]/a")); // xPath method
        actions.moveToElement(team_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void about_careers_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement career_link = browser.findElement(By.partialLinkText("CAREERS"));
        actions.moveToElement(career_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        browser.quit();
    }

    @Test
    void about_where_to_play_link_works() {
        WebDriver browser;

        System.setProperty("webdriver.chrome.driver", "E:/Applications/Development/AutomatedTestingSW/chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://www.gamblitgaming.com/");

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement where_to_play_link = browser.findElement(By.partialLinkText("WHERE TO PLAY"));
        actions.moveToElement(where_to_play_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        browser.quit();
    }
}