import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlogpageTest extends FunctionalTest {
    private static String startingURL = "https://gamblitgaming.com/blog";
    private static String blogPageNotLoadingMessage = "Gamblit Gaming Blog page did not load properly!";

    public void testStart() {
        driver.get(startingURL);
        driver.manage().window().maximize();
    }

    @Test
    public void clickAnnouncementsItem() {
        testStart();

        Blogpage blogpage = new Blogpage(driver);
        assertTrue(blogpage.isInitialized(), blogPageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/blog/categories/announcements", blogpage.returnURLAfterSelectingAnnouncementsItem(), "URLs for News: Announcements page do not match!");
    }

    @Test
    public void clickEventsItem() {
        testStart();

        Blogpage blogpage = new Blogpage(driver);
        assertTrue(blogpage.isInitialized(), blogPageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/blog/categories/events", blogpage.returnURLAfterSelectingEventsItem(), "URLs for News: Events page do not match!");
    }

    @Test
    public void clickPressItem() {
        testStart();

        Blogpage blogpage = new Blogpage(driver);
        assertTrue(blogpage.isInitialized(), blogPageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/blog/categories/press", blogpage.returnURLAfterSelectingPressItem(), "URLs for News: Press page do not match!");
    }

    @Test
    public void clickUncategorizedItem() {
        testStart();

        Blogpage blogpage = new Blogpage(driver);
        assertTrue(blogpage.isInitialized(), blogPageNotLoadingMessage);

        assertEquals("https://gamblitgaming.com/blog/categories/uncategorized", blogpage.returnURLAfterSelectingUncategorizedItem(), "URLs for News: Uncategorized page do not match!");
    }

    @Test
    public void clickArchiveDropDownItem() {
        String[][] datesArray = {{"November", "2013"}, {"April", "2016"}, {"May", "2018"}};

        for(int i = 0; i < datesArray.length; i++) {
            testStart();

            Blogpage blogpage = new Blogpage(driver);
            assertTrue(blogpage.isInitialized(), blogPageNotLoadingMessage);

            assertEquals("https://gamblitgaming.com/blog/" + datesArray[i][1] + "/" + blogpage.convertToNumericMonth(datesArray[i][0]), blogpage.returnArchivedNewsForMonthAndYear(datesArray[i][0], datesArray[i][1]), "URLs for News w/Archives page do not match!");
        }
    }
}
