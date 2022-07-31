package Tests;

import Base.BaseTest;
import Base.Hooks;
import Pages.HomePage;
import org.junit.Test;

public class HomePageTests extends Hooks{

    @Test
    public void homePageTests() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.elemente();

    }

}
