package ReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        //        code to get to the table page
        WebElement username = driver.findElement(By.xpath("//input[ @type ='text']"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[ @type ='password']"));
        password.sendKeys("Hum@nhrm123");

        WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

        WebElement pimButton= driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement employeeList= driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();


//        get a particular id  44969A and check the checkBox

        List<WebElement> listofID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

//        traverese

        for (int i=0;i< listofID.size();i++){

            String id = listofID.get(i).getText();

            if(id.equalsIgnoreCase("44969A") || id.equalsIgnoreCase("45021A")){
                System.out.println(i);
//                    check the checkBox
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]"));
                checkBox.click();

            }
        }
    }
}
