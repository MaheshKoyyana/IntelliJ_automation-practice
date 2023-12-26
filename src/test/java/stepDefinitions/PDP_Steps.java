package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.Base_PO;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;

public class PDP_Steps extends Base_PO {
    private WebDriver driver = getDriver();;


    @Given("I open new PDP for a chair product")
    public void i_open_new_pdp_for_a_chair_product()  {
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // Write code here that turns the phrase above into concrete actions
        navigateTo_URL("https://city:city@pp.cityfurniture.com/product/9721403/gianna-white-micro-left-chaise-sectional");
       driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
        System.out.println("Title:"+driver.getTitle());
        System.out.println("Url:"+driver.getCurrentUrl());
        System.out.println(driver.getTitle().contains(driver.getCurrentUrl()));
        System.out.println(driver.getCurrentUrl().contains(driver.getTitle()));
        assertFalse(driver.getTitle().contains(driver.getCurrentUrl()),"Page title contained URL");

    }

    @Then("I Click on addtoCart inside shopIntelligenceWidget")
    public void i_click_on_addto_cart_inside_shop_intelligence_widget() {
        // Write code here that turns the phrase above into concrete actions
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1800)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='st-cui-widget-iframe']"));
        System.out.println(iframe);
        driver.switchTo().frame(iframe);
        WebElement button= driver.findElement(By.cssSelector("[class*='EnsembleItem'] [class='MuiSvgIcon-root add-to-cart is-cart']"));
        System.out.println(button);
        button.click();




    }
}
