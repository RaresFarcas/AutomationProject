package Pages;

import Base.BaseTest;
import HelpMethods.HelpMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class AutovehiculePage extends BaseTest{

    public WebDriver driver;
    public HelpMethods helpMethods;

    public AutovehiculePage(WebDriver driver) {
        this.driver = driver;
        helpMethods = new HelpMethods(this.driver);
        PageFactory.initElements(driver,this);
        helpMethods.clickMethod(autobehiculeButton);
        helpMethods.clickMethod(cookie);
    }
    @FindBy(xpath ="//a[text()=' Stoc autoturisme']" )
    private WebElement autobehiculeButton;

    @FindBy(xpath = "//div[@class='col-6']/a")
    private List<WebElement> rulateNoi;

    @FindBy(xpath = "//div[@class='g-mb-0 g-mb-0']/label/div")
    private List<WebElement> tip;

    @FindBy(xpath = "/html/body/div[1]/div/a")
    private WebElement cookie;

    @FindBy(id = "id_marca_id")
    private WebElement marcaDD;

    @FindBy(id = "id_model_id")
    private WebElement modelDD;

    @FindBy(name = "an_fabricatie")
    private WebElement anDD;

    @FindBy(id = "rulaj")
    private WebElement rulajDD;

    @FindBy(name = "id_carburants")
    private WebElement carburantDD;

    @FindBy(name = "adresa_contact_id")
    private WebElement adresaDD;

    @FindBy(xpath = "//div[@class='g-mb-15']/label/div")
    private List<WebElement> sortare;

    @FindBy(name = "search")
    private WebElement filtreaza;

    @FindBy(xpath = "//div[@class='col-lg-7 col-xs-12 g-pt-0']/h2/a")
    private List<WebElement> textresult;

    public void autovehiculeFilters1(HashMap<String, String> inputData) throws InterruptedException {
        helpMethods.clickMethod(rulateNoi.get(0));
        helpMethods.clickMethod(tip.get(0));
        helpMethods.selectDropDown(marcaDD,inputData.get("marca1"));
        helpMethods.selectDropDown(modelDD,"SANDERO");
        helpMethods.selectDropDown(anDD,inputData.get("an1"));
        helpMethods.selectDropDown(rulajDD,inputData.get("rulaj3"));
        helpMethods.selectDropDown(carburantDD,inputData.get("combustibil1"));
        helpMethods.selectDropDown(adresaDD,inputData.get("adresa1"));
        helpMethods.clickMethod(sortare.get(1));
        helpMethods.clickMethod(filtreaza);
        helpMethods.scrollUp(400);
        helpMethods.navigateToAutovehicule();
    }

    public void autovehiculeFilters2(HashMap<String,String> inputData){
        helpMethods.clickMethod(rulateNoi.get(1));
        helpMethods.clickMethod(tip.get(0));
        helpMethods.selectDropDown(marcaDD,inputData.get("marca3"));
        helpMethods.selectDropDown(anDD,inputData.get("an3"));
        helpMethods.selectDropDown(rulajDD,inputData.get("rulaj1"));
        helpMethods.selectDropDown(adresaDD, inputData.get("adresa2"));
        helpMethods.clickMethod(sortare.get(0));
        helpMethods.clickMethod(filtreaza);
        helpMethods.scrollUp(400);
        helpMethods.navigateToAutovehicule();
    }

    public void autovehiculeFilters3(HashMap<String,String> inputData){
        helpMethods.clickMethod(rulateNoi.get(0));
        helpMethods.clickMethod(tip.get(1));
        helpMethods.selectDropDown(marcaDD,inputData.get("marca2"));
        helpMethods.selectDropDown(carburantDD,inputData.get("combustibil2"));
        helpMethods.clickMethod(sortare.get(2));
        helpMethods.clickMethod(filtreaza);
        helpMethods.scrollUp(400);
        helpMethods.navigateToAutovehicule();
    }

    public void autovehiculeFilters4(HashMap<String, String> inputData){
        helpMethods.selectDropDown(marcaDD,inputData.get("marca3"));
        helpMethods.selectDropDown(rulajDD,inputData.get("rulaj2"));
        helpMethods.selectDropDown(anDD,inputData.get("an2"));
        helpMethods.selectDropDown(carburantDD,inputData.get("combustibil3"));
        helpMethods.clickMethod(filtreaza);
        helpMethods.scrollUp(400);

    }
}
