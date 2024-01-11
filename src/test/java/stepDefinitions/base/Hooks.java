package stepDefinitions.base;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    public Hooks()
    {
        System.out.println("Hooks class is called");
        System.out.println("Hooks constructor code block is executed");
    }

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("Before All method is called");
    }

    @Before
    public void setup(Scenario scenario)
    {
        System.out.println("Before method is called");
        System.out.println(scenario.getId()+"\n"+scenario.getName()+"\n"+scenario.getSourceTagNames());
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
