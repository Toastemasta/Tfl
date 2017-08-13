import com.Pages.Editjo_page;
import com.Pages.Virgin_page;
import com.Utils.BasePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.lexer.Hr;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static com.openDriver.driver;

/**
 * Created by toastemaster on 8/7/2017.
 */
public class Virgin_sd {


    @Given("^I entered a url$")
    public void iEnteredAUrl()
    {
//        driver.get (url);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @And("^I entered \"([^\"]*)\" in the Where from field$")
    public void iEnteredInTheWhereFromField(String start) {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='FromStation_00aef7a2-13d5-4f6a-9608-35deb7b59562']")).sendKeys(start + Keys.ESCAPE);
    }

    @And("^I entered \"([^\"]*)\" in the Where to field$")
    public void iEnteredInTheWhereToField(String dest) {
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='ToStation_00aef7a2-13d5-4f6a-9608-35deb7b59562']")).sendKeys(dest + Keys.ESCAPE);
    }

    @And("^I entered  \"([^\"]*)\" date field$")
    public void iEnteredDateField(String date) {
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       driver.findElement(By.xpath(".//*[@id='00aef7a2-13d5-4f6a-9608-35deb7b59562']/div[3]/div[1]/fieldset[2]/div[1]/div/div/div[2]/button")).sendKeys(date + Keys.ESCAPE);
    }

    @And("^I entered \"([^\"]*)\" in the hour field$")
    public void iEnteredInTheHourField(String Hr){
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       driver.findElement(By.id("mainHours_00aef7a2-13d5-4f6a-9608-35deb7b59562")).sendKeys(Hr + Keys.ESCAPE);
    }

    @And("^I entered \"([^\"]*)\" in the minute field$")
    public void iEntetredInTheMinuteField(String mins) {
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       driver.findElement(By.id("mainMinutes_00aef7a2-13d5-4f6a-9608-35deb7b59562")).sendKeys(mins + Keys.ESCAPE);
    }

    @And("^I clicked return option$")
    public void iClickedReturnOption() {
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       // driver.findElement(By.xpath(".//*[@id='00aef7a2-13d5-4f6a-9608-35deb7b59562']/div[3]/div[2]/div[1]/div/div/fieldset/div[2]/label")).click();
       // driver.findElement(By.cssSelector(".radio-field")).click();
        driver.findElements(By.cssSelector(".radio-field>label")).get(1).click();
    }
}
