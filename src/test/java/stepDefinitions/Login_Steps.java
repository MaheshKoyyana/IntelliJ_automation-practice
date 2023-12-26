package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps  extends Base_PO {
    private Login_PO login_po;

    public Login_Steps(Login_PO login_po)
    {
        this.login_po = login_po;
    }
    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        // Write code here that turns the phrase above into concrete actions
        login_po.navigateTo_WebDriverUniversity_Login_Page();
    }
    @When("I enter a username {word}")
    public void i_enter_a_unique_username(String username) {
        //driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
        login_po.setUsername_TextField(username);
    }
    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
      //  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
       // sendData(By.xpath("//input[@id=\"password\"]"), password);
        login_po.setPassword_TextField(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
      //  driver.findElement(By.xpath("//button[@id=\"login-button\"]")).click();
        login_po.clickOn_Login_Button();
    }
    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
      login_po.validate_SuccessfullLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
       login_po.validate_UnsuccessfullLogin_Message();
    }

    @Then("I should be presented with following login validation message {}")
    public void i_should_be_presented_with_following_login_validation_message_validation_succeeded(String expectedMessage) {
       waitForAlert_And_ValidateText(expectedMessage);
    }


}
