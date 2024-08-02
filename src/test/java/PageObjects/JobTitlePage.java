package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePage {
    WebDriver driver;
    public JobTitlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Admin")
    WebElement admin;
    @FindBy(id = "menu_admin_Job")
    WebElement job;
    @FindBy(linkText = "Job Titles")
    WebElement jobTitles;
    @FindBy(id = "btnAdd")
    WebElement addButton;

    @FindBy(id = "jobTitle_jobTitle")
    WebElement addJobTitle;
    @FindBy(id = "jobTitle_jobDescription")
    WebElement jobDescription;
    @FindBy(id = "jobTitle_note")
    WebElement noteAdd;
    @FindBy(id = "btnSave")
    WebElement btnSave;

    public void clickOnAdmin(){
        admin.click();
    }
    public void clickOnJob(){
        job.click();
    }
    public void clickOnJobTitles(){
        jobTitles.click();
    }
    public void setAddButton() {
        addButton.click();
    }
    public void fillJobTitleForm(String jobTitle, String desc, String note){
        addJobTitle.sendKeys(jobTitle);
        jobDescription.sendKeys(desc);
        noteAdd.sendKeys(note);
    }
    public void clickOnSave(){
        btnSave.click();
    }
}
