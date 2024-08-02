package StepDefinitions;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass {

    // Static WebDriver instance shared across tests
    static WebDriver driver;

    // Page objects initialized in the constructor
    public LoginPage loginPage;
    public DashboardPage dashboardPage;
    AdminPage adminPage;
    EmployeePage employeePage;
    JobTitlePage jobTitlePage;

    public BaseClass()
    {
        // Initialize WebDriver only if it's not already initialized
        if (driver == null)
        {
            // Initialize WebDriver only if it's not already initialized
            System.setProperty("webdriver.gecko.driver", "/Users/selmatop/workspace/capstone_project/src/test/Drivers/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

        // Initialize page objects with the WebDriver instance
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        adminPage = new AdminPage(driver);
        employeePage = new EmployeePage(driver);
        jobTitlePage = new JobTitlePage(driver);
    }
    // Method to quit the driver
    public static void quitDriver()
    {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Method to get the current WebDriver instance
    public static WebDriver getDriver()
    {
        return driver;
    }
}

