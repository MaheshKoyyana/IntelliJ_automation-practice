package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    public Hooks()
    {
        System.out.println("Hooks class is called\n");
        System.out.println("This code block is executed");
    }
    @Before
    public void setup()
    {
        getDriver();
    }
    @AfterStep
    public void captureExceptionImage(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMillieseconds    = Long.toString(timestamp.getTime());
            byte[] screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",timeMillieseconds);
        }

    }
    @After
    public void tearDown()
    {
        cleanupDriver();
    }
}
