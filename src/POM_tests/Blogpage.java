import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;
import org.openqa.selenium.interactions.Actions;

public class Blogpage extends PageObject {
    @FindBy(id = "cat-dropdown")
    private WebElement categoryDropDownList;

    @FindBy(partialLinkText = "Announcements")
    private WebElement announcementsDropDownItem;

    @FindBy(partialLinkText = "Events")
    private WebElement eventsDropDownItem;

    @FindBy(partialLinkText = "Press")
    private WebElement pressDropDownItem;

    @FindBy(partialLinkText = "Uncategorized")
    private WebElement uncategorizedDropDownItem;

    @FindBy(id = "archives-dropdown")
    private WebElement archivesDropDownList;

    public Blogpage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return categoryDropDownList.isDisplayed();
    }

    public String returnURLAfterSelectingAnnouncementsItem() {
        categoryDropDownList.click();
        announcementsDropDownItem.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterSelectingEventsItem() {
        categoryDropDownList.click();
        eventsDropDownItem.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterSelectingPressItem() {
        categoryDropDownList.click();
        pressDropDownItem.click();

        return driver.getCurrentUrl();
    }

    public String returnURLAfterSelectingUncategorizedItem() {
        categoryDropDownList.click();
        uncategorizedDropDownItem.click();

        return driver.getCurrentUrl();
    }

    public String returnArchivedNewsForMonthAndYear(String month, String year) {
        //String monthValue = convertToNumericMonth(month);
        archivesDropDownList.click();
        WebElement archivesOption = driver.findElement(By.partialLinkText(month + " " + year));
        archivesOption.click();

        return driver.getCurrentUrl();
    }

    public String convertToNumericMonth(String month) {
        if(month != "" && !month.isEmpty()) {
            String numericMonthString = "";
            switch (month) {
                case "January": numericMonthString = "01";
                    break;
                case "February": numericMonthString = "02";
                    break;
                case "March": numericMonthString = "03";
                    break;
                case "April": numericMonthString = "04";
                    break;
                case "May": numericMonthString = "05";
                    break;
                case "June": numericMonthString = "06";
                    break;
                case "July": numericMonthString = "07";
                    break;
                case "August": numericMonthString = "08";
                    break;
                case "September": numericMonthString = "09";
                    break;
                case "October": numericMonthString = "10";
                    break;
                case "November": numericMonthString = "11";
                    break;
                case "December": numericMonthString = "12";
                    break;
            }

            return numericMonthString;
        } else {

            return "";
        }
    }
}