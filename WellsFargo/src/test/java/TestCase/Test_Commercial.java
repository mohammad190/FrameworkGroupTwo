package TestCase;

import WellsFargo_BankFeatures.Commercial;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Commercial extends CommonAPI {

    @Test
    public void CommercialFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Commercial_1();
    }
    @Test
    public void internationalOfficeFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.International_office_2();
    }
    @Test
    public void reportFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Get_report_3();
    }
    @Test
    public void HomeButtonFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Homebutton_4();
    }

    @Test
    public void paymentsFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Manage_payments_5();
    }
    @Test
    public void finincialFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Financing_trade_6();
    }
    @Test
    public void economicFeatures(){
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Economic_report_7();
    }
}
