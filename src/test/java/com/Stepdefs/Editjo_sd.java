package com.Stepdefs;

import com.Pages.Editjo_page;
import com.Utils.BasePage;
import com.openDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;
import net.sourceforge.htmlunit.corejs.javascript.ast.TryStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.openDriver.driver;
import static org.junit.Assert.assertEquals;

/**
 * Created by toastemaster on 8/4/2017.
 */

public class Editjo_sd  extends BasePage{
    public Editjo_page Editjo = PageFactory.initElements(driver, Editjo_page.class);


    @Given("^I entered a URL$")
    public void iEnteredAURL() {
        openURL();
    }

    @And("^I entered \"([^\"]*)\" in the From field$")
    public void iEnteredInTheFromField(String Fromstation) {

        Editjo.fromStation(Fromstation);
    }

    @And("^I entered \"([^\"]*)\" in the To field$")
    public void iEnteredInTheToField(String Tostation) {
        Editjo.toStation(Tostation);
    }

    @And("^I clicked the edit preferences button$")
    public void iClickedTheEditPreferencesButton() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       driver.findElement(By.xpath(".//*[@id='plan-a-journey']/fieldset/div[3]/a")).click();
    }

    @And("^I clicked the routes with few changes label$")
    public void iClickedTheRoutesWithFewChangesLabel() {
       driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[1]/fieldset/div/div/div[1]/label[2]")).click();
    }

    @And("^I clicked the Full step-free access label$")
    public void iClickedTheFullStepFreeAccessLabel() {
       driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[2]/li[2]/fieldset/div/div/div[1]/label[5]")).click();
    }

    @And("^I clicked the search outside London label$")
    public void iClickedTheSearchOutsideLondonLabel() {
       driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/ul[3]/li[4]/div/label")).click();
    }

    @And("^I clicked the Save these prefernces for future visits label$")
    public void iClickedTheSaveThesePreferncesForFutureVisitsLabel() {
     driver.findElement(By.xpath(".//*[@id='save-journey-planner-preferences']/div/label")).click();
    }

    @When("^I clicked the plan my journey button$")
    public void iClickedThePlanMyJourneyButton() {
      driver.findElement(By.xpath(".//*[@id='more-journey-options']/div/fieldset/input")).click();
    }

    @Then("^I should see \"([^\"]*)\" button$")
    public void iShouldSeeButton(String Expectedbutton) {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       System.out.println(Expectedbutton);
       String Actualbuttontext = driver.findElement(By.xpath(".//*[@id='scrollToHere']/div[2]/div/div[1]/div/div[1]/div/div[1]/div[4]/button")).getText();
       System.out.println(Actualbuttontext);
       assertEquals(Expectedbutton,Actualbuttontext) ;
    }

    @And("^I should see \"([^\"]*)\" hyperlink$")
    public void iShouldSeeHyperlink(String Expectlink) {
       System.out.println(Expectlink);
       String ActualLinktext = driver.findElement(By.xpath(".//*[@id='scrollToHere']/div[2]/div/div[1]/div/div[3]/div/div[3]/a[1]")).getText();
       System.out.println(ActualLinktext);
       assertEquals(Expectlink, ActualLinktext);
    }

    @And("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String ExpectedHeaderText) {
      System.out.println(ExpectedHeaderText);
      String ActualHeaderText = driver.findElement(By.xpath(".//*[@id='scrollToHere']/div[3]/h2")).getText();
      System.out.println(ActualHeaderText);
      assertEquals(ExpectedHeaderText, ActualHeaderText);
    }
}
