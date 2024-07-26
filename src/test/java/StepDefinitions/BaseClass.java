package StepDefinitions;

import PageObjects.AdminPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//Base class manages the Web Driver instance
public class BaseClass {

    static WebDriver driver;
    public LoginPage loginPage;
    public DashboardPage dashboardPage;
    AdminPage adminPage;

    public BaseClass() {
        if (driver == null) {
            // Initialize WebDriver only if it's not already initialized
            System.setProperty("webdriver.gecko.driver", "/Users/selmatop/workspace/capstone_project/src/test/Drivers/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

        // Initialize page objects
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        adminPage = new AdminPage(driver);
    }

    // Method to quit the driver
    public static void quitDriver()
    {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    }

