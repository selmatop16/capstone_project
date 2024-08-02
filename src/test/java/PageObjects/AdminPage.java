package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    public WebDriver driver;
    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Admin")
    WebElement adminMenu;
    @FindBy(id = "btnAdd")
    WebElement add;
    @FindBy(xpath = "//select[@id='systemUser_userType']/option[text()='Admin']")
    WebElement userRoleAdmin;
    @FindBy(xpath = "//select[@id='systemUser_userType']/option[text()='ESS']")
    WebElement userRoleEss;
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement employeeName;
    @FindBy(id = "systemUser_userName")
    WebElement sys_Username;
    @FindBy(xpath = "//select[@id='systemUser_status']/option[text()='Enabled']")
    WebElement statusEnabled;
    @FindBy(xpath = "//select[@id='systemUser_status']/option[text()='Disabled']")
    WebElement statusDisabled;
    @FindBy(id = "systemUser_password")
    WebElement sys_Password;
    @FindBy(id = "systemUser_confirmPassword")
    WebElement confirmPassword;
    @FindBy(id = "btnSave")
    WebElement saveButton;
    @FindBy(id = "ohrmList_chkSelectAll")
    WebElement checkAll;
    @FindBy(id = "searchBtn")
    WebElement clickSearch;
    @FindBy(id = "searchSystemUser_userName")
    WebElement clickSearchUser;
    @FindBy(id = "btnDelete")
    WebElement clickDelete;
    @FindBy(id = "dialogDeleteBtn")
    WebElement clickDeleteInPop;
    @FindBy(id ="resetBtn")
    WebElement clickReset;
    @FindBy(id = "btnCancel")
    WebElement clickCancel;
    public void clickOnAdminMenu() {
        adminMenu.click();
    }
    public void clickOnAdd() {
        add.click();
    }
    public void setUserRoles(String role) throws InterruptedException {
        if (role.equals("Admin")) {
            userRoleAdmin.click();
        } else if (role.equals("ESS")) {
            userRoleEss.click();
        } else {
            throw new IllegalArgumentException("Invalid role: " + role);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", (role.equals("Admin") ? userRoleAdmin : userRoleEss));
    }
    public void enterEmployee() {
        employeeName.sendKeys("1 1 1 (Past Employee)");
    }

    public void enterUsername() {
        sys_Username.sendKeys("Awesome");
    }

    public void setStatus(String status) {
        if (status.equals("Enabled")) {
            statusEnabled.click();
        } else if (status.equals("Disabled")) {
            statusDisabled.click();
        } else {
            throw new IllegalArgumentException("Invalid role: " + status);
        }
    }
    public void enterPassword() {
        sys_Password.sendKeys("Samuel@asdfgh123!./]");
    }
    public void confirmPassword() {
        confirmPassword.sendKeys("Samuel@asdfgh123!./]");
    }
    public void clickOnSave() {
        saveButton.click();
    }
    public void clickCheckBox() {
        checkAll.click();
    }
    public void clickSearchUser() {
        clickSearchUser.click();
        clickSearchUser.sendKeys("Awesome");
    }
    public void clickSearch() {
        clickSearch.click();
    }
    public void clickDeleteInPop() {
        clickDeleteInPop.click();
    }
    public void clickDelete() {
        clickDelete.click();
    }
    public void clickReset() {
        clickReset.click();
    }
    public void clickCancel() {
        clickCancel.click();
    }
}
