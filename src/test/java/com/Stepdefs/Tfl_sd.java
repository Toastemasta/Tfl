/*package com.Stepdefs;

import com.openDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by toastemaster on 7/27/2017.
 */

  /*public class Tfl_sd extends openDriver {


    @Given("^I entered a URL \"([^\"]*)\"$")
    public void iEnteredAURL(String url) {
         driver.get(url);
    }

    @And("^I entered \"([^\"]*)\" in from field$")
    public void iEnteredInFromField(String originStation) {
        driver.findElement(By.id("InputFrom")).sendKeys(originStation);
    }

    @And("^I entered \"([^\"]*)\" in to field$")
    public void iEnteredInToField(String destinationStation) {
        driver.findElement(By.id("InputTo")).sendKeys(destinationStation+ Keys.ESCAPE);


    }

    @And("^I enter \"([^\"]*)\" in the origin field$")
    public void iEnterInTheOriginField(String origin) {
       driver.findElement(By.id("InputFrom")).sendKeys(origin);
    }

    @And("^I enter \"([^\"]*)\" in the destination field$")
    public void iEnterInTheDestinationField(String dest) {
        driver.findElement(By.id("InputTo")).sendKeys(dest);
    }

    @When("^I click the Plan my journey button$")
    public void iClickThePlanMyJourneyButton() throws InterruptedException {
        Thread.sleep(5000);
      driver.findElement(By.xpath(".//*[@id='plan-a-journey']/fieldset/input")).click();
    }


    @Then("^I should see \"([^\"]*)\" header text$")
    public void iShouldSeeHeaderText(String ExpheaderText) {
        System.out.println(ExpheaderText.toUpperCase());

        String ActualheaderText= driver.findElement(By.xpath(".//*[@id='full-width-content']/div/div[2]/div/h1/span")).getText();
        System.out.println(ActualheaderText);
        assertEquals(ExpheaderText.toUpperCase(),ActualheaderText);
    }

    @And("^I should see \"([^\"]*)\" in from field$")
    public void iShouldSeeInFromField(String fromoriginStation) throws Throwable {
        System.out.println(fromoriginStation);
        String ActualoriginStation= driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[1]/strong")).getText();
        System.out.println(ActualoriginStation);
        assertEquals(fromoriginStation,ActualoriginStation);
    }

    @And("^i should see \"([^\"]*)\" in to field$")
    public void iShouldSeeInToField(String destinationStation) {
        System.out.println(destinationStation);
        String ActualdestinationStation= driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[1]/div[2]/strong")).getText();
        System.out.println(ActualdestinationStation);
        assertEquals(destinationStation,ActualdestinationStation);
    }

       @And("^I should see edit \"([^\"]*)\" hyperlink$")
    public void iShouldSeeEditHyperlink(String Editjourney) {
        System.out.println(Editjourney);
        String Actuallink= driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[1]/div[3]/a[1]/span")).getText();
        System.out.println(Actuallink);
        assertEquals(Editjourney, Actuallink);
    }

       @And("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String Travelpreferenceandaccessibility) {
        System.out.println(Travelpreferenceandaccessibility);
        String Actualtext = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[3]/div[2]/div/div")).getText();
        System.out.println(Actualtext);
        assertEquals(Travelpreferenceandaccessibility,Actualtext);
    }

    @And("^I should see \"([^\"]*)\" hyperlink$")
    public void iShouldSeeHyperlink(String Editpreferences) {
        System.out.println(Editpreferences);
        String Actualink = driver.findElement(By.xpath(".//*[@id='plan-a-journey']/div[3]/div[4]/a")).getText();
        System.out.println(Actualink);
        assertEquals(Editpreferences,Actualink);

    }
}
*/