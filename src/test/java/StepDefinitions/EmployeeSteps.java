package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps extends BaseClass{
    @When("user clicks on PIM menu")
    public void user_clicks_on_pim_menu() {
      employeePage.clickOnPimMenu();
    }
    @When("user click on Add  Employee")
    public void user_click_on_add_employee() {
       employeePage.clickOnAddEmployee();
    }
    @When("^user enters (.*), (.*),and (.*)$")
    public void user_enters_first_name_middle_name_and_last_name(String firstName, String middleName, String lastName) {
        employeePage.enterFullName(firstName,middleName,lastName);
    }
    @Then("^enters (.*)$")
    public void enters_employee_id(String empId) {
        employeePage.enterEmpId(empId);
    }
    @Then("click on check box")
    public void click_on_check_box() {
      employeePage.setCheckBox();
    }
    @Then("upload a file")
    public void upload_a_file() {
       employeePage.uploadFile();
    }
    @Then("^enter (.*),(.*) and (.*)$")
    public void enter_username_password_and_confirm_password(String name, String pw, String confirmPw) {
       employeePage.createLogin(name, pw, confirmPw);
    }
    @Then("add status as Enabled")
    public void add_status_as_enabled() {
        employeePage.getStatus("Enabled");
    }
    @Then("click on save button")
    public void click_on_save_button() {
        employeePage.setSave();
    }
}
