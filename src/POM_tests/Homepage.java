import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends PageObject {
    @FindBy(xpath = "//img[@ src='/assets/images/glc-badge.jpg']")
    private WebElement gliLink;

    @FindBy(partialLinkText = "Facebook")
    private WebElement facebookLink;

    @FindBy(partialLinkText = "Twitter")
    private WebElement twitterLink;

    @FindBy(className = "logo")
    private WebElement gamblitLogoLink;

    @FindBy(linkText = "ABOUT")
    private WebElement aboutLink;

    @FindBy(linkText = "DEVELOPERS")
    private WebElement developersLink;

    @FindBy(linkText = "OPERATORS")
    private WebElement operatorsLink;

    @FindBy(linkText = "GAMES")
    private WebElement gamesLink;

    @FindBy(linkText = "NEWS")
    private WebElement newsLink;

    @FindBy(linkText = "CONTACT")
    private WebElement contactLink;

    @FindBy(partialLinkText = "Responsible")
    private WebElement responsibleGamingLink;

    @FindBy(partialLinkText = "Careers")
    private WebElement careersLink;

    @FindBy(linkText = "TEAM")
    private WebElement aboutTeamLink;

    @FindBy(partialLinkText = "CAREERS")
    private WebElement aboutCareersLink;

    @FindBy(partialLinkText = "WHERE TO PLAY")
    private WebElement aboutWhereToPlayLink;

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return gamblitLogoLink.isDisplayed();
    }

    // TODO: Need to figure out a better method rather than using Thread.sleep, just as in the non-POM version of the tests
    public String returnURLAfterGLILinkClicked() {
        gliLink.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String childWindow : allWindows) {
            if(!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

        return driver.getCurrentUrl();
    }

    public String returnURLAfterFacebookLinkClicked() {
        facebookLink.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String childWindow : allWindows) {
            if(!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

        return driver.getCurrentUrl();
    }

    public String returnURLAfterTwitterLinkClicked() {
        twitterLink.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String childWindow : allWindows) {
            if(!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

        return driver.getCurrentUrl();
    }

    public String returnURLAfterGamblitLogoClicked() {
        gamblitLogoLink.click();

        return driver.getCurrentUrl();
    }


    public String returnURLAfterAboutLinkClicked() {
        aboutLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterDevelopersLinkClicked() {
        developersLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterOperatorsLinkClicked() {
        operatorsLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterGamesLinkClicked() {
        gamesLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterNewsLinkClicked() {
        newsLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterContactLinkClicked() {
        contactLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterResponsibleGamingLinkClicked() {
        responsibleGamingLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterCareersLinkClicked() {
        careersLink.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterAboutTeamLinkClicked() {
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutLink);

        actions.moveToElement(aboutTeamLink).click().build().perform();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterAboutCareersLinkClicked() {
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutLink);

        actions.moveToElement(aboutCareersLink).click().build().perform();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterAboutWhereToPlayLinkClicked() {
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutLink);

        actions.moveToElement(aboutWhereToPlayLink).click().build().perform();

        return driver.getCurrentUrl();
    }
}
