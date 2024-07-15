package PageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    WebElement username;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement login;

   public void setUsername(String name){
        username.clear();
        username.sendKeys(name);
   }

   public void setPassword(String psw){
       password.clear();
       password.sendKeys(psw);
   }
   public void clickLogin(){
       login.click();
   }

}
