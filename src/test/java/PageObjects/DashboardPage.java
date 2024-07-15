package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
   @FindBy(id = "menu_dashboard_index")
    WebElement dashboard;
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   //Verifying if dashboard is displayed
    public void checkDashboardIsDisplayed()
    {
        dashboard.isDisplayed();
    }
}
