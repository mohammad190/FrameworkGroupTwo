package TestCase;

import WellsFargo_BankFeatures.Accounts_Catagory;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Customer_Account_Catagory extends CommonAPI {
    @Test
    public void AccountTrade()throws InterruptedException{
        Accounts_Catagory accounts_catagory = PageFactory.initElements(driver,Accounts_Catagory.class);
        accounts_catagory.AccountTrade("Trade");
    }

    @Test
    public void User_ID()throws InterruptedException {
        Accounts_Catagory accounts_catagory = PageFactory.initElements(driver, Accounts_Catagory.class);
        accounts_catagory.user_ID("hsv123");
    }

    @Test
    public void user_Password()throws InterruptedException {
        Accounts_Catagory accounts_catagory = PageFactory.initElements(driver, Accounts_Catagory.class);
        accounts_catagory.user_password("12");
    }

    @Test
    public void SignIn()throws InterruptedException {
        Accounts_Catagory accounts_catagory = PageFactory.initElements(driver, Accounts_Catagory.class);
        accounts_catagory.SignIn();
    }



}
