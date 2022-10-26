package com.Syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginElements {
    public static void main(String[] args) {

        //got to Fb.com
// Enter Username
// Enter password
// click login
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto fb.com
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
//        enter the Username in the TextBOX
                //         1.locate the element and send the keys
                driver.findElement(By.id("email")).sendKeys("abracadbara");
//        enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("waow12345678");
//        click the login
        driver.findElement(By.name("login")).click();

        //Task2 Forget Pass
        driver.findElement(By.partialLinkText("Forgot password?")).click();
    }
}
