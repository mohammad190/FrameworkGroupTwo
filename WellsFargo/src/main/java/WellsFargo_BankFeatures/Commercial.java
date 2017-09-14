package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Commercial extends CommonAPI {

    @FindBy(how = How.ID,using = "tabNavCommercial")
    public static WebElement Commercial;

    @FindBy(how = How.CSS,using = "    @FindBy(how = How.CSS,using = \"\")\n")
    public static WebElement International_office;

    @FindBy(how = How.CSS,using = "#headerTools>nav>ul>li>a")
    public static WebElement Get_report;

    @FindBy(how = How.XPATH,using = ".//*[@id='menu-managing-payments-1']/li[1]/a")
    public static WebElement HomeButton;


    @FindBy(how = How.XPATH,using = ".//*[@id='menu-managing-payments-1']/li[3]/a")
    public static WebElement Managing_payments;

    @FindBy(how = How.XPATH,using = ".//*[@id='menu-managing-payments-1']/li[4]/a")
    public static WebElement Financing_trade;

    @FindBy(how = How.XPATH,using = ".//*[@id='menu-managing-payments-1']/li[5]/a")
    public static WebElement Economic_report;

    public void Commercial_1() {
        Commercial.click();
        driver.navigate().to("https://www.wellsfargo.com/com/international/locations");
    }
    public void International_office_2() {
        International_office.click();

        //driver.navigate().back();
    }
    public void Get_report_3() {
        Get_report.click();
    }
    public void Homebutton_4() {
        HomeButton.click();
    }
    public void Manage_payments_5() {
        Managing_payments.click();

    }
    public void Financing_trade_6() {
        Financing_trade.click();
    }
    public void Economic_report_7() {
        Economic_report.click();
    }
}
