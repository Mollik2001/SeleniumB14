package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShoot {
    public static void main(String[] args) throws InterruptedException, IOException {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        maximize
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);
        Thread.sleep(3000);
//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test",Keys.ENTER);


        // take screenshoot
        TakesScreenshot ss=(TakesScreenshot) driver;
        // screenshoot is taken at this point
        File sourcefile = ss.getScreenshotAs(OutputType.FILE);
        // save the file from your variable into the location into your computer
        FileUtils.copyFile(sourcefile,new File("ss/myscshoot/aaa.png"));


    }
}
