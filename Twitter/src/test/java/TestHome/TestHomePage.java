package TestHome;

import Twitter_Features.T_HomePage;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void TwitterHomePage() {
        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage1();

    }

    @Test
    public void WellsHomePage1() {

        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage1();
    }

    @Test
    public void WellsHomePage2() {

        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage2();
    }

    @Test
    public void WellsHomePage3() {

        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage3();
    }

    @Test
    public void WellsHomePage4() {

        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage4();
    }

    @Test
    public void WellsHomePage5() {

        T_HomePage page = PageFactory.initElements(driver, T_HomePage.class);
        page.HomePage5();
    }
}
