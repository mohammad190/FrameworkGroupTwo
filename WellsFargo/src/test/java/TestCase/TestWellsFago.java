package TestCase;

import WellsFargo_BankFeatures.CommonAPI;
import WellsFargo_BankFeatures.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWellsFago extends CommonAPI {

    @Test
    public void WellsHomePage(){

        HomePage page = PageFactory.initElements(driver,HomePage.class);
        page.HomePage();
    }
















//    @Test
//    public void loginCodeFight() {
//
//        HomePage codeLogin = PageFactory.initElements(driver, HomePage.class);
//        codeLogin.loginCodeFight("sujondpi@yahoo.com","01914138863");
//    }



}
