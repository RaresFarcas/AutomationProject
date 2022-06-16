package Tests;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends BaseTest {

    @Test
    public void WindowTest(){

        WebElement SkipElement = Driver.findElement(By.id("btn2"));
        SkipElement.click();

        WebElement switchToElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);           // obiect fac cu mouse orice
        action.moveToElement(switchToElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        alertsElement.click();

        Driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> Windows = Driver.findElements(By.cssSelector(".analystic"));
        Windows.get(0).click();
        WebElement click1 = Driver.findElement(By.cssSelector("#Tabbed>a>button"));        // # se foloseste la id . se foloseste la clasa
        click1.click();

        List<String> tabList = new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(tabList.get(1));   // m-am mutat pe al 2-lea tab
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(tabList.get(0));   //m-am mutat pe primul tab
        System.out.println(Driver.getTitle());

        Windows.get(1).click();
        WebElement click2 = Driver.findElement(By.cssSelector("#Seperate>button"));        // # se foloseste la id . se foloseste la clasa
        click2.click();

        List<String> WindowList = new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(WindowList.get(1));
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(WindowList.get(0));   //m-am mutat pe primul tab
        System.out.println(Driver.getTitle());

        Windows.get(2).click();
        WebElement click3 = Driver.findElement(By.cssSelector("#Multiple>button"));
        click3.click();

        List<String> TabsList = new ArrayList<>(Driver.getWindowHandles());
        Driver.switchTo().window(TabsList.get(2));
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(TabsList.get(1));   //m-am mutat pe  tab2
        System.out.println(Driver.getTitle());
        Driver.close();
        Driver.switchTo().window(TabsList.get(0));   //m-am mutat pe primul tab
        System.out.println(Driver.getTitle());


    }



}
