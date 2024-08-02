package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
    public WebDriver driver;
    public EmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "PIM")
    WebElement pimMenu;

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addEmployee;
    @FindBy(id = "firstName")
    WebElement enterName;
    @FindBy(id = "middleName")
    WebElement enterMiddleName;
    @FindBy(id = "lastName")
    WebElement enterLastName;

    @FindBy(id = "employeeId")
    WebElement empId;
    @FindBy(id = "photofile")
    WebElement photoFile;
    @FindBy(id = "chkLogin")
    WebElement checkBox;
    @FindBy(id = "user_name")
    WebElement userName;

    @FindBy(id = "user_password")
    WebElement userPassword;
    @FindBy(id = "re_password")
    WebElement rePassword;
    @FindBy(id = "status")
    WebElement enabled;
    @FindBy(linkText = "Disabled")
    WebElement disabled;
    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    WebElement saveButton;
    public void clickOnPimMenu(){
        pimMenu.click();
    }
    public void clickOnAddEmployee(){
        addEmployee.click();
    }
    public void enterFullName(String firstName, String middleName, String lastName){
        enterName.sendKeys(firstName);
        enterMiddleName.sendKeys(middleName);
        enterLastName.sendKeys(lastName);
    }
    public void enterEmpId(String id){
      empId.sendKeys(id);
    }
    public void setCheckBox(){
        checkBox.click();
    }
    public void uploadFile(){
        photoFile.sendKeys("/Users/selmatop/Desktop/IMG_1551.JPG");
    }
    public void createLogin(String name, String pw, String confirmPw){
        userName.sendKeys(name);
        userPassword.sendKeys(pw);
        rePassword.sendKeys(confirmPw);
    }
    public void getStatus(String status)
    {
        if(status.equals("Enabled"))
        {
            enabled.click();
        }else if (status.equals("Disabled"))
        {
            disabled.click();
        }else
        {
            throw new IllegalArgumentException("Invalid role: " + status);
        }
    }
    public void setSave(){
        saveButton.click();
    }

}
