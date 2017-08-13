package com.Utils;

import com.Pages.Editjo_page;
import com.openDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

import static com.openDriver.driver;

/**
 * Created by toastemaster on 8/6/2017.
 */
public class BasePage {

    public WebDriverWait wait = new WebDriverWait(driver,60);

    openDriver openD = new openDriver();

    public void openURL(){
        driver.get(openD.url);
    }


 public void waitforElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
 }

}
