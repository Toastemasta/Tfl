package com.Pages;

import com.Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static com.openDriver.driver;

/**
 * Created by toastemaster on 8/6/2017.
 */
public class Editjo_page extends BasePage{

    @FindBy(id = "InputFrom")
    private WebElement origin;


    @FindBy(id = "InputTo")
    private WebElement destination;


    public void fromStation(String FromStation){
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitforElement(origin);
        driver.findElement(By.id("InputFrom" )).sendKeys(FromStation + Keys.ESCAPE);
    }
    public void toStation (String Tostation){
       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        waitforElement(destination);
        driver.findElement(By.id("InputTo")).sendKeys(Tostation + Keys.ESCAPE);
    }


}
