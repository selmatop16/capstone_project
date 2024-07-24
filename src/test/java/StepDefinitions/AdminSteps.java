package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminSteps extends BaseClass {
    @When("clicks on Admin menu")
    public void clicks_on_admin_menu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement adminMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Admin")));
        adminPage.clickOnAdminMenu();
        driver.switchTo().defaultContent();
    }
    @And("Click on Add button")
    public void click_on_add_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
        adminPage.clickOnAdd();
    }
    @Then("Select user role as Admin")
    public void select_user_role_as_admin() throws InterruptedException {
        adminPage.setUserRoles("Admin");
    }
    @And("Enter employee name")
    public void enter_employee_name() {
       adminPage.enterEmployee();
    }
    @And("Enter username")
    public void enter_username() {
       adminPage.enterUsername();
    }

    @And("Select Status as Enabled")
    public void select_status_as_enabled() {
       adminPage.setStatus("Enabled");
    }

    @And("Enter password")
    public void enter_password() {
        adminPage.enterPassword();
    }

    @And("Enter confirm password")
    public void enter_confirm_password() {
       adminPage.confirmPassword();
    }

    @And("Click on Save button")
    public void click_on_save_button() {
        adminPage.clickOnSave();
    }

    @Then("Close browser")
    public void close_browser() {
     quitDriver();
    }

}
