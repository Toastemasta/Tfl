import com.openDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by toastemaster on 7/29/2017.
 */
public class Myfirstfeature_sd extends openDriver {


    @Given("^I entered a website \"([^\"]*)\"$")
    public void iEnteredAWebsite(String url) {
        driver.get(url);
    }



    @And("^I clicked the \"([^\"]*)\" button$")
    public void iClickedTheButton(String arg0) {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/button")).click();
    }

    @And("^I clicked the sign in button$")
    public void iClickedTheSignInButton() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.findElement(By.xpath(".//*[@id='pageWrapper']/header/div[1]/div[1]/nav[2]/ul/li[2]/span/a[2]/span[1]")).click();
    }

    @And("^I enter my e-mail address as \"([^\"]*)\"$")
    public void iEnterMyEMailAddressAs(String email) {
        driver.findElement(By.id("signin-username")).sendKeys(email);
    }

    @And("^I enter my password as \"([^\"]*)\"$")
    public void iEnterMyPasswordAs(String password) {
        driver.findElement(By.id("signin-password")).sendKeys(password);
    }

    @When("^I click the sign-in button$")
    public void iClickTheSignInButton() {
        driver.findElement(By.id("signin-login")).click();
    }
}
