package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Syntax Batch 14");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(1000);


    }
}
