package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  extends BaseClass{
    @Before
    public void setUp() {
        // This will be executed before each scenario
        if (BaseClass.getDriver() == null) {
            new BaseClass();
        }
    }
    @After
    public void tearDown() {
        // This will be executed after each scenario
        BaseClass.quitDriver();
    }
}
