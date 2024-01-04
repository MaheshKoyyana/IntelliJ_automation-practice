package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Home_PO;
import pageObjects.Login_PO;

public class Home_Steps {
    private Home_PO home_po;
    public Home_Steps(Home_PO home_po)
    {
        this.home_po= home_po;
    }



    @Given("I access the webdriver university home page")
    public void i_access_the_webdriver_university_home_page() {
        // Write code here that turns the phrase above into concrete actions
        home_po.navigateTo_WebDriverUniversity();
    }
    @Then("I should see the links")
    public void i_should_see_the_links() {
       System.out.println("Contact form link:"+home_po.getContact_us_form());
       home_po.setName("Web Driver University");
       System.out.println("Name:"+ home_po.getName());

    }
}
