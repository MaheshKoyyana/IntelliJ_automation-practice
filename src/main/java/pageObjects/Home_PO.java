package pageObjects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Global_Vars;
@Getter
@Setter
public class Home_PO extends Base_PO {
    public Home_PO()
    {
        super();
    }
    private String name;
    private @FindBy(css = "a[id='contact-us'] h4")
    WebElement contact_us_form;

    private @FindBy(css = "a[id='contact-us'] h4")
    WebElement login_portal_link;

    public void navigateTo_WebDriverUniversity() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL);
    }
}
