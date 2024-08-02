package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class AdminSteps extends BaseClass {
    @When("clicks on Admin menu")
    public void clicks_on_admin_menu() throws InterruptedException {
        Thread.sleep(5000);
        adminPage.clickOnAdminMenu();
        driver.switchTo().defaultContent();
    }
    @And("Click on Add button")
    public void click_on_add_button() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('btnAdd').click();");

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
    public void click_on_save_button() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose
        adminPage.clickOnSave();
    }
    @Then("selects all system users")
    public void selects_all_system_users() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose
        adminPage.clickCheckBox();
    }
    @Then("Close browser")
    public void close_browser() {
        quitDriver();
    }
    @When("admin enters system username")
    public void admin_enters_system_username() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose
        adminPage.clickSearchUser();
    }


    @When("clicks search button")
    public void clicks_search_button() {
        adminPage.clickSearch();
    }

    @When("clicks delete button")
    public void clicks_delete_button() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose
        adminPage.clickDelete();
    }

    @When("user clicks OK button in pop up to delete existing user")
    public void user_clicks_button_in_pop_up_to_delete_existing_user() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose{
        adminPage.clickDeleteInPop();
    }
    @When("clicks reset button")
    public void clicks_reset_button() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose{{
        adminPage.clickReset();
    }
    @Then("clicks on Cancel button")
    public void clicks_on_cancel_button() throws InterruptedException {
        Thread.sleep(5000); // wait for 5 seconds for Demo purpose{{
        adminPage.clickCancel();
    }
}

