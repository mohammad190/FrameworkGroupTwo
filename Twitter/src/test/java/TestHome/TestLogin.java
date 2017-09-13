package TestHome;

import Twitter_Features.T_Login;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI {


    @Test
    public void Testing_login() throws InterruptedException {
        T_Login t_login = PageFactory.initElements(driver,T_Login.class);
        t_login.userName_Box("sujondpi@yahoo.com","");

    }



}
