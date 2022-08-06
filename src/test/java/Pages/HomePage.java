package Pages;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.HelpMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.HashMap;
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

    @FindBy(xpath = "//p[@class='g-py-40']/a")
    private WebElement buyback;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='nume']")
    private WebElement Nume;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='prenume']")
    private WebElement Prenume;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='telefon']")
    private  WebElement telefon;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='email']")
    private WebElement email2;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='localitate']")
    private WebElement localitate;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='judet']")
    private WebElement judet;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='marca']")
    private WebElement marca;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='model']")
    private WebElement model;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='fabricatie']")
    private WebElement fabricatie;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='combustibil']")
    private WebElement combustibil;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='km']")
    private WebElement km;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='caroserie']")
    private WebElement caroserie;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='transmisie']")
    private WebElement transmisie;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='cilindree']")
    private WebElement cilindree;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='serie_sasiu']")
    private WebElement sasiu;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='data_primei_inmatriculari']")
    private WebElement inmatriculare;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='numar_inmatriculare']")
    private WebElement numar;

    @FindBy(xpath = "//div[@class='row']/div/input[@id='ce_masina_intentionati_sa_achizitionati']")
    private WebElement dorinta;

    @FindBy(id = "dotari_si_alte_specificatii")
    private WebElement dotari;

    @FindBy(id = "copie_carte_de_identitate_a_masinii")
    private WebElement CI;

    @FindBy(xpath = "//div[@class='row']/div/input[@name='poze_masina[]']")
    private WebElement poza;

    @FindBy(name = "terms")
    private WebElement terms;

    @FindBy(name = "bifa2[]")
    private List<WebElement> bife;

    @FindBy(xpath = "//div[@id='modal_bb']/button/i")
    private WebElement X;

    @FindBy(xpath = "//div[@class='form-group']/input[@id='nume']")
    private WebElement testdrivenume;

    @FindBy(xpath = "//div[@class='form-group']/input[@id='prenume']")
    private WebElement testdriveprenume;

    @FindBy(xpath = "//div[@class='form-group']/input[@id='email']")
    private WebElement testdriveemail;

    @FindBy(xpath = "//div[@class='form-group']/input[@id='telefon']")
    private WebElement testdrivetelefon;

    @FindBy(id = "mesaj")
    private WebElement mesaj;

    @FindBy(xpath = "//div[@class='position-relative']/a/img[@alt='SOLICITA TEST DRIVE']")
    private WebElement solicita;

    @FindBy(name = "bifa2")
    private WebElement bifa2;

    @FindBy(name = "bifa1")
    private WebElement bifa1;

    @FindBy(name = "bifa3")
    private WebElement bifa3;

    @FindBy(xpath = "//div[@class='form-check form-check-inline']/input[@value='Da']")
    private List<WebElement> valueDa;

    @FindBy(xpath = "//div[@id='modal6']/button")
    private WebElement elementulX;



    public void simpleElements() throws InterruptedException {
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
        helpMethods.clickandback(tiriac);
        helpMethods.navigateToHome();
        helpMethods.clickfooter(footer1,4);
        helpMethods.clickfooter(footer2,5);


    }
    public void solicitaEvaluare(HashMap<String,String> value) throws InterruptedException {
        helpMethods.sendKeysMethod(insertemail, value.get("email"));
        helpMethods.clickMethod(abonarebut);
        helpMethods.tabClear();
        helpMethods.clickMethod(buyback);
        helpMethods.sendKeysMethod(Nume,value.get("nume"));
        helpMethods.sendKeysMethod(Prenume,value.get("prenume"));
        helpMethods.sendKeysMethod(telefon, value.get("telefon"));
        helpMethods.sendKeysMethod(email2, value.get("email"));
        helpMethods.sendKeysMethod(localitate, value.get("localitate"));
        helpMethods.sendKeysMethod(judet, value.get("judet"));
        helpMethods.sendKeysMethod(marca, value.get("marca"));
        helpMethods.sendKeysMethod(model, value.get("model"));
        helpMethods.sendKeysMethod(fabricatie, value.get("fabricatie"));
        helpMethods.sendKeysMethod(km, value.get("km"));
        helpMethods.sendKeysMethod(caroserie, value.get("caroserie"));
        helpMethods.sendKeysMethod(combustibil, value.get("combustibil"));
        helpMethods.sendKeysMethod(transmisie, value.get("transmisie"));
        helpMethods.sendKeysMethod(cilindree, value.get("cilindree"));
        helpMethods.sendKeysMethod(sasiu, value.get("sasiu"));
        helpMethods.sendKeysMethod(inmatriculare, value.get("inmatriculare"));
        helpMethods.sendKeysMethod(numar, value.get("numar"));
        helpMethods.sendKeysMethod(dorinta, value.get("dorinta"));
        helpMethods.sendKeysMethod(dotari, value.get("dotari"));
        helpMethods.sendKeysMethod(CI,value.get("carte"));
        helpMethods.sendKeysMethod(poza,value.get("passat"));
        helpMethods.clickMethod(terms);
        helpMethods.whileMaxNr(bife,3);
        helpMethods.clickMethod(X);
    }

    public void solicitaTestDrive(HashMap<String,String> value) throws InterruptedException {
        Thread.sleep(500);
        helpMethods.clickMethod(locatiiCariere.get(1));
        helpMethods.sendKeysMethod(testdrivenume,value.get("nume"));
        helpMethods.sendKeysMethod(testdriveprenume,value.get("prenume"));
        helpMethods.sendKeysMethod(testdriveemail,value.get("email"));
        helpMethods.sendKeysMethod(testdrivetelefon,value.get("telefon"));
        helpMethods.sendKeysMethod(mesaj,value.get("mesaj"));
        helpMethods.clickMethod(bifa1);
        helpMethods.clickMethod(bifa2);
        helpMethods.clickMethod(bifa3);
        helpMethods.whileMaxNr(valueDa,1);
        helpMethods.clickMethod(elementulX);

    }
}

