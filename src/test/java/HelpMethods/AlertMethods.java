package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertMethods {

    public WebDriver Driver;

    public AlertMethods(WebDriver driver){
        Driver = driver;
    }
    public void simpleAlert(){
        Alert simple = Driver.switchTo().alert();


    }
    public void fillAcceptAlert(String value){
        Alert textalert = Driver.switchTo().alert();
        textalert.sendKeys(value);

    }
    public void validateElementText(WebElement element, String expected){
        String actualvALUE = element.getText();
    }
}
