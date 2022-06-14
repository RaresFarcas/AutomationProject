package Tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest extends BaseTest {
        //public WebDriver Driver;

    @Test
    public void MetodaLogin(){

        // Setam driverul de chrome

        //  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        // Deschidem un browser de chrome

        //  Driver = new ChromeDriver();

        // Accesam un url

        //  Driver.get("http://demo.automationtesting.in/Index.html");

        // Maximized page

        //  Driver.manage().window().maximize();            // Fullscreen dispare si bara de jos
        //  Driver.manage().window().minimize();    // maximize = face fullscreen              // minimize = baga in bara.
        //  Driver.manage().window().maximize();            // Maximize e doar fullscreen - recomandat

        // Identificam butonul SingIn

        WebElement SignInElement = Driver.findElement(By.id("btn1"));
        SignInElement.click();

        // Validam pagina de LogIn

        String ExpectedPage = "SignIn";
        String ActualPage = Driver.getTitle();          // getTitle imi ia titlul paginii din inspect.
        Assert.assertEquals("Expected page was not displayed", ExpectedPage, ActualPage);

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

        // Validam mesaj de eroare

        WebElement CodError = Driver.findElement(By.id("errormsg"));
        String ExpectedError = "Invalid User Name or PassWord";
        String ActualError = CodError.getText();        // getText imi ia mesaju ce apare pe site
        Assert.assertEquals("The displayed text of the error is not correct",ExpectedError, ActualError);   //Se poate si cu mesaj si fara mesaj

        // Inchidem pagina

        //Driver.quit();             // close - inchide tabul              quit - inchide pagina - de preferat.
    }
}
