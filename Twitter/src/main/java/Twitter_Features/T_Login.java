package Twitter_Features;

import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class T_Login extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
    public static WebElement get_Login;

    @FindBy(how = How.CSS,using = ".text-input.email-input.js-signin-email")
    public static WebElement get_userName;

    @FindBy(how = How.NAME,using = "session[password]")
    public static WebElement get_password;

    @FindBy(how = How.XPATH,using = ".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
    public static WebElement get_login_Button;


    public static void userName_Box(String email, String password)throws InterruptedException{
        get_Login.click();

        get_userName.sendKeys(email);

        get_password.sendKeys(password);

        get_login_Button.click();

        Thread.sleep(3000);
    }
}

