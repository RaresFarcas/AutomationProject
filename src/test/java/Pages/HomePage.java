package Pages;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.HelpMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseTest{
    public WebDriver driver;
    public HelpMethods helpMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        helpMethods = new HelpMethods(this.driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[text()=' Stoc autoturisme']")
    private WebElement stocAuto;

    @FindBy(xpath = "//a[text()=' 0264 438 121 ']")
    private WebElement nrtel;

    @FindBy(xpath = "//a[text()='office@inter-auto.ro']")
    private WebElement email;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement logo;

    @FindBy(xpath = "/html/body/div[1]/div/a")
    private WebElement cookie;

    @FindBy(css = ".nav-link")
    private List<WebElement> headerButtons;

    @FindBy(css = ".containerxxxx")
    private List<WebElement> slidepic;

    @FindBy(css = ".slick-prev")
    private List<WebElement> prevArrow;

    @FindBy(css = ".slick-next")
    private List<WebElement> nextArrow;

    @FindBy(css = ".slick-dots>li")
    private List<WebElement> dots;

    @FindBy(xpath = "//div[@class='row g-mb-30 ']/div/a")
    private List<WebElement> vehicleBrands;

    @FindBy(xpath = "//a[text()='Vezi oferta']")
    private List<WebElement> vehiclesForSale;

    @FindBy(css = ".js-next")
    private List<WebElement> forsaleArrows;

    @FindBy(css = ".position-relative")
    private List<WebElement> locatiiCariere;

    @FindBy(id = "mce-EMAIL")
    private WebElement insertemail;

    @FindBy(id = "mc-embedded-subscribe")
    private WebElement abonarebut;

    @FindBy(xpath = "//div[@class='col-lg-3 g-py-30  g-bg-white  text-center  d-flex align-items-center justify-content-center']/a/img")
    private WebElement tiriac;

    @FindBy(xpath = "//div[@class='col-lg-3 g-bg-secondary  g-py-30 d-flex align-items-center']/ul/li")
    private List<WebElement> footer1;

    @FindBy(xpath = "//div[@class='col-lg-3 g-bg-secondary g-py-30 d-flex align-items-center']/ul/li")
    private List<WebElement> footer2;

    public void elemente() throws InterruptedException {
        helpMethods.clickMethod(stocAuto);
        helpMethods.getTitleMethod(1);
        helpMethods.navigateback();
        helpMethods.clickMethod(nrtel);
//        helpMethods.clickMethod(email);
        helpMethods.navigateToHome();
        helpMethods.clickMethod(logo);
        helpMethods.clickMethod(cookie);
        Thread.sleep(500);
        helpMethods.headderButtonsList(headerButtons, 5);
        helpMethods.navigateToHome();
        helpMethods.clickMethod(prevArrow.get(0));
        helpMethods.clickMethod(nextArrow.get(0));
        helpMethods.navigateToHome();
        helpMethods.slidepicWhile(slidepic, dots);
        helpMethods.navigateToHome();
        helpMethods.autobrands(vehicleBrands,11);
        helpMethods.tabClear();
        helpMethods.navigateToHome();
        helpMethods.forSale(vehiclesForSale,forsaleArrows);
        helpMethods.forSaleNew(vehiclesForSale,forsaleArrows);
        helpMethods.locprogramarecariere(locatiiCariere,3);
        helpMethods.tabClear();
        helpMethods.sendKeysMethod(insertemail,0);
        helpMethods.clickMethod(abonarebut);
        helpMethods.tabClear();
        helpMethods.clickandback(tiriac);
        helpMethods.navigateToHome();
        helpMethods.clickfooter(footer1,4);
        helpMethods.clickfooter(footer2,5);


    }
}

