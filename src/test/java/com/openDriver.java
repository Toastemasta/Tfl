package com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by toastemaster on 7/29/2017.
 */
    public class openDriver {

       public static WebDriver driver;
        public  static String url;
        public void browser () throws IOException {

        String browser = System.getProperty("browser");
        String environment = System.getProperty("environment");

        String srcFolder = "src\\test\\java\\com\\PropertyFiles\\";
        String envFile = null;

        if (environment.toUpperCase().equals("QA")){
            envFile = srcFolder + "QA.properties";

        } else if (environment.toUpperCase().equals("UAT")){
            envFile = srcFolder + "UAT.properties";

        } else if (environment.toUpperCase().equals("Live")){
            envFile = srcFolder + "Live.properties";
        }

        FileInputStream fis = new FileInputStream(envFile);
        Properties pro = new Properties();
        pro.load(fis);
         url = pro.getProperty("url");
        System.out.println(url);


        if (browser.equals("Chrome")){
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();

        } else if (browser.equals("firefox")){
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();

        } else if (browser.equals("safari")){
            driver = new SafariDriver();

        } else if (browser.equals("IE")){
            driver = new InternetExplorerDriver();
        }
    }

//    public void quitBrowser() {
//        driver.quit();
//
//    }


}



