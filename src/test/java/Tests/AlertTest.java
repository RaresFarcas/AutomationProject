package Tests;

import base.BaseTest;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends BaseTest {

@Test
    public void AlertTest(){


        WebElement switchToElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);           // obiect fac cu mouse orice
        action.moveToElement(switchToElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        // Driver navigare
        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        String expectedPage = "Alerts";
        String actualPage = Driver.getTitle();
        Assert.assertEquals("Pagina dorita nu a fost deschisa",expectedPage,actualPage);

        List<WebElement> alerteList = Driver.findElements(By.cssSelector(".analystic"));        // .analystic toate elementele din lista au valoarea asta la clasa
        alerteList.get(0).click();
        WebElement simpleAlertElement = Driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        simpleAlertElement.click();
        Alert simpleAlert = Driver.switchTo().alert();      // ma mut pe alerta si dau ok pe alerta
        simpleAlert.accept();

        alerteList.get(1).click();
        WebElement alertOkCancelElement = Driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alertOkCancelElement.click();
        Alert alertOkCancel = Driver.switchTo().alert();
        alertOkCancel.dismiss();

        WebElement CancelElement = Driver.findElement(By.id("demo"));
        String expectedElement = CancelElement.getText();
        String actualElement = "You Pressed Cancel";
        Assert.assertEquals("Mesajul nu e corect",expectedElement,actualElement);

        alerteList.get(2).click();
        WebElement alertTextElement = Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        alertTextElement.click();
        Alert alertText = Driver.switchTo().alert();
        String alertValue = "Rares";        //valori pt parametri cu maven gasesc pe net ca sa nu pun "Rares" in cod.
        alertText.sendKeys(alertValue);
        alertText.accept();

        WebElement mesajEroare = Driver.findElement(By.id("demo1"));
        String actualMessage=mesajEroare.getText();
        String expectedMessage = "Hello "+alertValue+" How are you today";
        Assert.assertEquals("Mesajul nu este cel dorit",expectedMessage,actualMessage);

        }
}

