package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //        goto syntaxProject.com radio button
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
//        get the radio button Male
                WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
//        check if the radio btn is displayed
        boolean displayStatus = maleRadioBtn.isDisplayed();
//        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);
        // check weather ther radio button is enabled

        boolean enablestatus = maleRadioBtn.isEnabled();
        System.out.println("Rdaio button is Enabled:"+enablestatus);

        // check wheater radio button is selected
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("Radio button is selected:"+selectStatus);

        // checkif the radio button male is not selected then click on it

        if(!selectStatus){
//            perfrom a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);

    }
    }

