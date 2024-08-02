package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JobTitleSteps extends BaseClass{
    private ExcelReader excelReader = new ExcelReader();
    private String excelFilePath = "/Users/selmatop/workspace/capstone_project/ReadData.xlsx";
    @And("user clicks on Admin menu")
    public void user_clicks_on_admin_menu() throws InterruptedException {
       Thread.sleep(5000);
       jobTitlePage.clickOnAdmin();
    }
    @And("users click on Job menu")
    public void users_click_on_job_menu() {
       jobTitlePage.clickOnJob();
    }
    @And("selects Job Titles and clicks it")
    public void selects_job_titles_and_clicks_it() {
        jobTitlePage.clickOnJobTitles();
    }
    @And("user clicks on add button")
    public void user_clicks_on_add_button() {
    jobTitlePage.setAddButton();
    }

    @When("^user fills the form from given sheetName (.*) and rowNumber (\\d+)$")
    public void user_fills_the_form_from_given_sheet_name_job_titles_and_row_number(String sheetName, Integer rowNumber) throws IOException {
        List<Map<String, String>> testData = excelReader.getData(excelFilePath, sheetName);
        String jobTitle = testData.get(rowNumber).get("Job Title ");
        String description = testData.get(rowNumber).get("Job Description");
        String note = testData.get(rowNumber).get("Note");
        jobTitlePage.fillJobTitleForm(jobTitle,description,note);
    }
    @And("user saves it")
    public void user_saves_it() {
       jobTitlePage.clickOnSave();
    }
}
