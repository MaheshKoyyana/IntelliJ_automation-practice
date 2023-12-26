package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.WebDriver;


import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;


public class Contact_Us_Steps extends Base_PO{

    private Contact_Us_PO contact_us_po;
    public Contact_Us_Steps(Contact_Us_PO contact_us_po)
    {
        this.contact_us_po=contact_us_po;
    }
    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
           contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Joe");
        contact_us_po.setUnique_FirstName();
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
       // driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Blogs");
        contact_us_po.setUnique_LastName();
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
       // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
        contact_us_po.setEmailAddress_TextField();
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        // driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello World");
        contact_us_po.setUnique_Comment();
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
       // driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
        contact_us_po.clickOn_Submit_Button();
    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
       // WebElement element = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        //Assert.assertEquals(element.getText(),"Thank You for your Message!");
        contact_us_po.validate_Successful_SubmissionMessage_Text();
    }


}
