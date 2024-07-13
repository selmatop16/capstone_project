package StepDefinitions;

import PageObjects.AdminPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    WebDriver driver;
    LoginPage login;
    DashboardPage dashboardPage;
    AdminPage adminPage;

    //created for generating random string for unique email
    public static String randomestring(){
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }
}
