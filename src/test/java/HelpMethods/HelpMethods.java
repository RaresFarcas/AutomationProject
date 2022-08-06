package HelpMethods;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelpMethods {
    public WebDriver driver;

    public HelpMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMethod(WebElement element) {
        element.click();
    }

    public void clickandback(WebElement element){
        element.click();
        tabClear();
    }

    public void clickfooter(List<WebElement> element, Integer index) throws InterruptedException {
        Integer num = 0;
        while (num<=index){
            WaitForElements(By.xpath("//div[@class='row g-mb-30 ']/div/a"));
            clickMethod(element.get(num));
            Thread.sleep(500);
            navigateToHome();
            num++;
        }
    }

    public void headderButtonsList(List<WebElement> element, Integer count) throws InterruptedException {
        Integer index = 0;
        Integer startpage = 1;
        while (index <= count) {
            Thread.sleep(500);
            element.get(index).click();
            getTitleMethod(startpage);
            index++;
            startpage++;
        }
    }

    public void getTitleMethod(Integer page) {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("RMB Inter Auto");
        pages.add("Autovehicule - RMB Inter Auto");
        pages.add("Promotii - RMB Inter Auto");
        pages.add("Servicii - RMB Inter Auto");
        pages.add("Noutati - RMB Inter Auto");
        pages.add("Companie - RMB Inter Auto");
        pages.add("Contact - RMB Inter Auto");
        pages.add("Noua gama electrificata KONA.");
        pages.add("Mercedes-Benz Home");

        String actualPage = driver.getTitle();
        Assert.assertEquals("Pagina corecta nu a fost afisata", pages.get(page), actualPage);
    }

    public void navigateback() {
        driver.navigate().back();
    }

    public void navigateToHome() {
        driver.navigate().to("https://www.inter-auto.ro/");
    }

    public void autobrands(List<WebElement> element, Integer count) {
        Integer i = 0;
        while (i <= count) {
            element.get(i).click();
            navigateToHome();
            i++;
        }
    }

    public void tabClear() {
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        Integer index = 1;
        while (index <= windowList.size()) {
            if (windowList.size() != index) {
                driver.switchTo().window(windowList.get(index));
                driver.close();
                index++;
            }
            if (windowList.size() == index) {
                break;
            }
        }
        driver.switchTo().window(windowList.get(0));
    }


    public void forSale(List<WebElement> element, List<WebElement> arrow) {
        Integer start = 4;
        while (start <= 8) {
            if (start % 8 == 0) {
                clickMethod(arrow.get(0));
            }
            element.get(start).click();
            navigateback();
            start++;
        }
    }

    public void WaitForElements(By identificator) {
        Integer count = 0;
        while (count == 0){
            count = driver.findElements(identificator).size();  // Asteapta pana cand mi se returneaza ceva diferit de 0 pentru identificatorul respectiv
        }
    }

    public void forSaleNew(List<WebElement> element, List<WebElement> arrow) throws InterruptedException {
        Integer start = 20;
        Integer index = 0;
        while (start <= 43) {
            if (index >= 4) {
                clickMethod(arrow.get(1));
            }
            if (index >= 8) {
                Thread.sleep(500);
                clickMethod(arrow.get(1));
            }
            if (index >= 12) {
                Thread.sleep(500);
                clickMethod(arrow.get(1));
            }
            if (index >= 16) {
                Thread.sleep(500);
                clickMethod(arrow.get(1));
            }
            if (index >= 20) {
                Thread.sleep(500);
                clickMethod(arrow.get(1));
            }
            if (start >= 26) {
                Thread.sleep(500);
            }
            element.get(start).click();
            navigateback();
            //astept pana cand lista de branduri e incarcata
            WaitForElements(By.xpath("//div[@class='row g-mb-30 ']/div/a"));
            start++;
            index++;
    }

}

public void slidepicWhile(List<WebElement> element, List<WebElement> dot) throws InterruptedException {
        Integer index = 1;
        Integer nrdot = 0;
        while (nrdot<=13){
            if (index == 11){
                index=index+11;
            }
            Thread.sleep(700);
            dot.get(nrdot).click();
            Thread.sleep(700);
            element.get(index).click();
            navigateback();
            index++;
            nrdot++;
        }
}

    public void locprogramarecariere(List<WebElement> element, Integer count) throws InterruptedException {
        Integer i = 0;
        while (i <= count){
            if (i==1){
                i++;
            }
            element.get(i).click();
            Thread.sleep(500);
            navigateToHome();
            i++;
        }
    }

    public void sendKeysMethod(WebElement element, String val){
        element.sendKeys(val);
    }

    public void scrollDown(Integer val){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+val+")", "");
    }

    public void whileMaxNr(List<WebElement> element, Integer max) throws InterruptedException {
        Integer index = 0;
        while (index <=max){
            element.get(index).click();
            index++;
        }
    }
}

