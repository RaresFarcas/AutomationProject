package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.SplittableRandom;

public class RegisterTest {
        public WebDriver Driver;

        @Test
        public void MetodaLogin(){

            System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

            Driver = new ChromeDriver();

            Driver.get("http://demo.automationtesting.in/Index.html");

            Driver.manage().window().maximize();

            WebElement SkipElement = Driver.findElement(By.id("btn2"));
            SkipElement.click();

            String expectedPage = "Register";
            String actualPage = Driver.getTitle();
            Assert.assertTrue("Expected page was not displayed.", expectedPage.equals(actualPage));     // assertTrue sau assertFalse pt boolean

            WebElement firstNameElement = Driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
            String firstNameValue = "Farcas";
            firstNameElement.sendKeys(firstNameValue);

            WebElement lastNameElement = Driver.findElement(By.xpath("//input[@ng-model='LastName']"));
            String lastNameValue = "Rares Flavius Cristian";
            lastNameElement.sendKeys(lastNameValue);

            WebElement adressElement = Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
            String adressValue = "Cluj-Napoca";
            adressElement.sendKeys(adressValue);

            WebElement emailElement = Driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
            String emailValue = "frfc@yah.cag";
            emailElement.sendKeys(emailValue);

            WebElement phoneElement = Driver.findElement(By.cssSelector("input[ng-model='Phone']"));
            String phoneValue = "0712888123";
            phoneElement.sendKeys(phoneValue);

            WebElement genderElement = Driver.findElement(By.cssSelector("input[value='Male'"));
            genderElement.click();

            WebElement femaleElement = Driver.findElement(By.cssSelector("input[value='FeMale'"));
            femaleElement.click();

            WebElement hobbyElement1 = Driver.findElement(By.id("checkbox1"));
            hobbyElement1.click();

            WebElement hobbyElement2 = Driver.findElement(By.id("checkbox2"));
            hobbyElement2.click();

            WebElement hobbyElement3 = Driver.findElement(By.id("checkbox3"));
            hobbyElement3.click();

            // Scroll down

            JavascriptExecutor js = (JavascriptExecutor) Driver;
            js.executeScript("window.scrollBy(0,250)", "");

            WebElement languageElement = Driver.findElement(By.id("msdd"));
            languageElement.click();

            List<WebElement> languageOptions = Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
            Integer index = 0;
            while (index<languageOptions.size()){
                if (languageOptions.get(index).getText().equals("English")){
                    languageOptions.get(index).click();
                    break;
                }
                index++;
            }
            genderElement.click();      // ca sa dispara toate optiunile de limbi


            WebElement skillsElement = Driver.findElement(By.id("Skills"));     //Dropdown - are select in fata. daca nu are SELECT nu merge cu parinte/copil
            Select skillsDropDown = new Select(skillsElement);
            skillsDropDown.selectByVisibleText("Unix");

            WebElement countryDDElement = Driver.findElement(By.cssSelector("span[class='select2-selection select2-selection--single']"));
            countryDDElement.click();
            WebElement countryElement = Driver.findElement(By.cssSelector("input[class='select2-search__field']"));
            String countryfieldInput = "Japan";
            countryElement.sendKeys(countryfieldInput);
            countryElement.sendKeys(Keys.ENTER);                    // In cazu asta se poate cu for sau while ca la Languages.


            WebElement yearElement = Driver.findElement(By.id("yearbox"));
            Select yearDropdown = new Select(yearElement);
            yearDropdown.selectByVisibleText("1919");

            WebElement monthElement = Driver.findElement(By.cssSelector("select[placeholder='Month']"));
            Select monthDropdown = new Select(monthElement);
            monthDropdown.selectByVisibleText("December");

            WebElement dayElement = Driver.findElement(By.id("daybox"));
            Select dayDropdown = new Select(dayElement);
            dayDropdown.selectByVisibleText("8");

            JavascriptExecutor js2 = (JavascriptExecutor) Driver;
            js2.executeScript("window.scrollBy(0,250)", "");

            WebElement firstPwElement = Driver.findElement(By.id("firstpassword"));
            String firstPw = "1234567";
            firstPwElement.sendKeys(firstPw);

            WebElement secondPwElement = Driver.findElement(By.id("secondpassword"));
            String secondPw = "1234567";
            secondPwElement.sendKeys(secondPw);

            WebElement chooseElement = Driver.findElement(By.id("imagesrc"));
            chooseElement.sendKeys("C:\\Users\\rares\\Desktop\\ssTest.jpg");

            WebElement submitElement = Driver.findElement(By.id("submitbtn"));
            submitElement.click();

            Driver.quit();
        }
}
