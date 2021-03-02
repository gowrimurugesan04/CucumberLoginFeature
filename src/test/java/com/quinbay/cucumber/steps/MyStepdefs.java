package com.quinbay.cucumber.steps;

import com.quinbay.cucumber.CucumberHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MyStepdefs
{

   CucumberHooks ch=new CucumberHooks();

    @Given("^I am on Facebook login page$")
    public void m1()
    {
        CucumberHooks.driver.get("https://www.facebook.com");
        //driver.get(s);
        //get -> Launch url opening the website

        System.out.println("Logged in");
    }
    @When("^I enter username as (.*)$")
    public void m2(String username)
    {
        //WebDriver driver = new ChromeDriver();
        //this.driver=driver;
        CucumberHooks.driver.findElement(By.id("pass")).sendKeys(username);
        System.out.println("Username : "+username);
    }
    @And("^I enter password as (.*)$")
    public void m3(String password)
    {
        //WebDriver driver = new ChromeDriver();
        CucumberHooks.driver.findElement(By.id("pass")).sendKeys(password);
        System.out.println("Password : "+password);
    }
    @Then("^Login should fail")
    public void m4()//throws InterruptedException
    {
       // WebDriver driver = new ChromeDriver();
       CucumberHooks.driver.findElement(By.xpath("//button[@name='login']")).click();
        System.out.println("Trying to Login");
        //Thread.sleep(3000);
        //CucumberHooks.driver.quit();
    }
    @And("this is a test")
    public void thisIsATest() {
        System.out.println("This is a test");
    }
}
