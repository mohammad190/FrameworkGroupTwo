package TestCase;

import WellsFargo_BankFeatures.CommonAPI;
import WellsFargo_BankFeatures.Loans_Credit;
import org.openqa.selenium.support.PageFactory;

public class Credit_Features extends CommonAPI {

    public void Features_Loans_Credit()throws InterruptedException{

        Loans_Credit loans_credit = PageFactory.initElements(driver,Loans_Credit.class);
        loans_credit.Features_Loans_Credit("abcdef","acsd1234");
    }
}
