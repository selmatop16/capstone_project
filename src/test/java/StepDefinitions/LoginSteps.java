package StepDefinitions;

import PageObjects.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{

    @When("User opens URL")
    public void user_opens_url() {
    driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @And("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
       loginPage.setUsername(username);
       loginPage.setPassword(password);
    }

    @And("Click on Login")
    public void click_on_login() {
       loginPage.clickLogin();
       dashboardPage =  new DashboardPage(driver);
    }
    @Then("user is navigated to the Dashboard page")
    public void user_is_navigated_to_the_dashboard_page() {
        dashboardPage.checkDashboardIsDisplayed();
    }
}
