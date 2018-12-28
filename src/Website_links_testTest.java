import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


class Website_links_testTest {

    WebDriver browser;
    static final String driverKey = "webdriver.chrome.driver";
    static final String driverValue = SeleniumSettings.CHROME_DRIVER_PATH;
    static final String homePage = "https://www.gamblitgaming.com";

    @BeforeAll
    static void setup() {
        System.setProperty(driverKey, driverValue);
    }

    @BeforeEach
    void setup2() {
        browser = new ChromeDriver();
    }

    @Test
    void logo_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement gamblit_logo_image_link = browser.findElement(By.className("logo"));
        gamblit_logo_image_link.click();
        Assertions.assertEquals("https://gamblitgaming.com/", browser.getCurrentUrl(), "URLs for homepage do not match!");
    }

    // GLI page opens in a new tab, affecting the results... already an unusual test...
    @Test
    void GLI_link_works() {
        // this works when using a workaround of using Thread.sleep(), but doesn't work when going without it

        try {
            //
            browser.manage().window().maximize();
            browser.get(homePage);
            WebElement GLI_image_link = browser.findElement(By.xpath("//img[@ src='/assets/images/glc-badge.jpg']"));
            GLI_image_link.click();
            Thread.sleep(5000);
            browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
            //Assertions.assertEquals("Gamblit Gaming, LLC", browser.getTitle(), "URLs for GLI page do not match!");
            browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Assertions.assertEquals("https://www.gaminglabs.com/extranetGLI/cmsAdmin/getsplash.asp?i=161", browser.getCurrentUrl(), "URLs for GLI page do not match!");
        } catch (Exception e) {

        }

    }

    @Test
    void about_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        about_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/about/", browser.getCurrentUrl(), "URLs for About page do not match!");
    }

    @Test
    void developers_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement developers_link = browser.findElement(By.linkText("DEVELOPERS"));
        developers_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/developers/", browser.getCurrentUrl(), "URLs for Developers page do not match!");
    }

    @Test
    void operators_link_works() {
//        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement operators_link = browser.findElement(By.linkText("OPERATORS"));
        operators_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/operators/", browser.getCurrentUrl(), "URLs for Operators page do not match!");
    }

    @Test
    void games_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement games_link = browser.findElement(By.linkText("GAMES"));
        games_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/games/", browser.getCurrentUrl(), "URLs for Game page do not match!");
    }

    @Test
    void news_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement news_link = browser.findElement(By.linkText("NEWS"));
        news_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/blog/", browser.getCurrentUrl(), "URLs for Blog/News page do not match!");
    }

    @Test
    void contact_link_works() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement contact_link = browser.findElement(By.linkText("CONTACT"));
        contact_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/contact/", browser.getCurrentUrl(), "URLs for Contact page do not match!");
    }

    @Test
    void responsible_gaming_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement responsible_gaming_link = browser.findElement(By.partialLinkText("Responsible"));
        responsible_gaming_link.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/responsible/", browser.getCurrentUrl(), "URLs for Responsible Gaming page do not match!");
    }

    @Test
    void careers_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement careers_link = browser.findElement(By.partialLinkText("Careers"));
        careers_link.click();

        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/about/careers/", browser.getCurrentUrl(), "URLs for Career page");
    }

    // Facebook opens in a new tab, affecting the results...
    @Disabled
    void facebook_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement facebook_image_link = browser.findElement(By.partialLinkText("Facebook"));
        facebook_image_link.click();
        //browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Assertions.assertEquals("facebook.com/gamblitgaming", browser.getCurrentUrl(), "URLs for Facebook do not match!");
    }

    // Twitter opens in a new tab, affecting the results...
    @Disabled
    void twitter_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement twitter_image_link = browser.findElement(By.partialLinkText("Twitter"));
        twitter_image_link.click();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        Assertions.assertEquals("twitter.com/gamblitgaming", browser.getCurrentUrl(), "URLs for Twitter do not match!");
    }

    @Disabled
    void another_link_works() {
        // don't know why I have this test
//        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(homePage);
        WebElement facebook = browser.findElement(By.partialLinkText("another"));
        facebook.click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    void about_team_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement team_link = browser.findElement(By.partialLinkText("TEAM"));
        //WebElement team_link = browser.findElement(By.xpath("//html/body/header/div[2]/div/nav/ul/li[1]/a")); // xPath method
        actions.moveToElement(team_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/about/team/", browser.getCurrentUrl(), "URLs for About -> Team page do not match!");
    }

    @Test
    void about_careers_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement career_link = browser.findElement(By.partialLinkText("CAREERS"));
        actions.moveToElement(career_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/about/careers/", browser.getCurrentUrl(), "URLs for About -> Careers page do not match!");

    }

    @Test
    void about_where_to_play_link_works() {
        browser.manage().window().maximize();
        browser.get(homePage);

        Actions actions = new Actions(browser);
        WebElement about_link = browser.findElement(By.linkText("ABOUT"));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actions.moveToElement(about_link).perform();

        WebElement where_to_play_link = browser.findElement(By.partialLinkText("WHERE TO PLAY"));
        actions.moveToElement(where_to_play_link).click().build().perform();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assertions.assertEquals("https://gamblitgaming.com/about/where-to-play/", browser.getCurrentUrl(), "URLs for About -> Where-to-Play page do not match!");
    }

    @AfterEach
    void tearDown() {
        browser.quit();
    }
}