package Base;

import Property.PropertyFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public void setupMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
//        PropertyFile driverResource = new PropertyFile("/DriverData/Driver");
//        System.setProperty(driverResource.getValue("driver"), driverResource.getValue("pathDriver"));
        driver = new ChromeDriver();
        driver.get("https://www.inter-auto.ro/");
//        driver.get(driverResource.getValue("RMB"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public WebDriver getDriver(){
        return driver;
    }

}
