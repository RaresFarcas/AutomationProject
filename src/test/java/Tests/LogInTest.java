package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
    public WebDriver Driver;

    @Test
    public void MetodaLogin(){

        // Setam driverul de chrome

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        // Deschidem un browser de chrome

        Driver = new ChromeDriver();

        // Accesam un url

        Driver.get("http://demo.automationtesting.in/Index.html");

        // Identificam butonul SingIn

        WebElement SignInElement = Driver.findElement(By.id("btn1"));
        SignInElement.click();

        // Identificam butonul de email

        WebElement EmailElement = Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String EmailValue = "raressffrr@email.com";
        EmailElement.sendKeys(EmailValue);

        // Identificam campul de parola

        WebElement PasswordElement = Driver.findElement(By.xpath("//input[@ng-model='Password']"));
        String PasswordValue = "123456";
        PasswordElement.sendKeys(PasswordValue);

        // Click pe butonul de Enter

        WebElement EnterElement = Driver.findElement(By.id("enterbtn"));
        EnterElement.click();

    }
}
