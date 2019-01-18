import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomepageTest extends FunctionalTest {
    private static String startingURL = "http://gamblitgaming.com";
    private static String homepageNotLoadingMessage = "Gamblit homepage did not load properly!";

    public void testStart() {
        driver.get(startingURL);
        driver.manage().window().maximize();
    }

    @Test
    public void clickGamblitLogoTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/", homepage.returnURLAfterGamblitLogoClicked(), "URLs for Homepage do not match!");
    }

    @Test
    public void clickGLILinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://access.gaminglabs.com/certificate/index?i=161", homepage.returnURLAfterGLILinkClicked(), "URLs for Gamblit Gaming's GLI page do not match!");
    }

    @Test
    public void clickFacebookLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://www.facebook.com/gamblitgaming", homepage.returnURLAfterFacebookLinkClicked(), "URLs for Gamblit Gaming's Facebook page do not match!");
    }

    @Test
    public void clickTwitterLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://twitter.com/gamblitgaming", homepage.returnURLAfterTwitterLinkClicked(), "URLs for Gamblit Gaming's Twitter page do not match!");
    }

    @Test
    public void clickAboutLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/about/", homepage.returnURLAfterAboutLinkClicked(), "URLs for About page do not match!");
    }

    @Test
    public void clickDevelopersLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/developers/", homepage.returnURLAfterDevelopersLinkClicked(), "URLs for Developers page do not match!");
    }

    @Test
    public void clickOperatorsLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/operators/", homepage.returnURLAfterOperatorsLinkClicked(), "URLs for Operators page do not match!");
    }

    @Test
    public void clickGamesLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/games/", homepage.returnURLAfterGamesLinkClicked(), "URLs for Game page do not match!");
    }

    @Test
    public void clickNewsLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/blog/", homepage.returnURLAfterNewsLinkClicked(), "URLs for Blog/News page do not match!");
    }

    @Test
    public void clickResponsibleGamingLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/responsible/", homepage.returnURLAfterResponsibleGamingLinkClicked(), "URLs for Responsible Gaming page do not match!");
    }

    @Test
    public void clickCareersLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/about/careers/", homepage.returnURLAfterCareersLinkClicked(), "URLs for Careers link do not match!");
    }

    @Test
    public void clickAboutTeamLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/about/team/", homepage.returnURLAfterAboutTeamLinkClicked(), "URLs for About -> Team page do not match!");
    }

    @Test
    public void clickAboutCareersLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/about/careers/", homepage.returnURLAfterAboutCareersLinkClicked(), "URLs for About -> Careers page do not match!");
    }

    @Test
    public void clickAboutWhereToPlayLinkTest() {
        testStart();

        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.isInitialized(), homepageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/about/where-to-play/", homepage.returnURLAfterAboutWhereToPlayLinkClicked(), "URLs for About -> Where to Play page do not match!");
    }
}
