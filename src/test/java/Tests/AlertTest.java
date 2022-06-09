package Tests;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
    public WebDriver Driver;
@Test
    public void AlertTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        Driver = new ChromeDriver();

        Driver.get("http://demo.automationtesting.in/Register.html");

        Driver.manage().window().maximize();

        WebElement switchToElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchToElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        // Driver navigare
        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        String expectedPage = "Alerts";
        String actualPage = Driver.getTitle();
        Assert.assertEquals("Pagina dorita nu a fost deschisa",expectedPage,actualPage);



    }
}
