package Tests;

import Base.Hooks;
import Pages.AutovehiculePage;
import com.beust.ah.A;
import org.junit.Test;

import java.util.HashMap;

public class AutovehiculePageTests extends Hooks{

    @Test
    public void autovehiculePageTests() throws InterruptedException {
        AutovehiculePage autovehiculePage = new AutovehiculePage(driver);
        autovehiculePage.autovehiculeFilters1(inputData);
        autovehiculePage.autovehiculeFilters2(inputData);
        autovehiculePage.autovehiculeFilters3(inputData);
        autovehiculePage.autovehiculeFilters4(inputData);
    }
}
