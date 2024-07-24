package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
   @FindBy(id = "menu_dashboard_index")

    WebElement dashboard;
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   //Verifying if dashboard is displayed
   public boolean checkDashboardIsDisplayed() {
       try {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
           wait.until(ExpectedConditions.visibilityOf(dashboard));
           return dashboard.isDisplayed();
       } catch (Exception e) {
           System.out.println("Dashboard element not found: " + e.getMessage());
           return false;
       }
   }
}