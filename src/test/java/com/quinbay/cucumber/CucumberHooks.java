package com.quinbay.cucumber;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CucumberHooks{
    public static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver=new ChromeDriver();
    }
    @Before
    public void before()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //LoginSteps loginSteps=new LoginSteps(driver);
        System.out.println("Executing before ");
        System.out.println(driver);
    }
    public WebDriver getDriver() {
        return driver;
    }
    @After
    public void after ()
    {
        System.out.println("After execution");
        // Thread.sleep(3000);
        driver.quit();
    }
}