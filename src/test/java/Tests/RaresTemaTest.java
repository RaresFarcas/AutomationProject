package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaresTemaTest {
    public WebDriver Driver;
    @Test
    public void RMB(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://www.inter-auto.ro/");
        WebElement Email = Driver.findElement(By.id("mce-EMAIL"));
        String Emailvalue = "rhzoragnas@bcdr.sijbgv";
        Email.sendKeys(Emailvalue);
        WebElement Abonare = Driver.findElement(By.id("mc-embedded-subscribe"));
        Abonare.click();
    }
}
