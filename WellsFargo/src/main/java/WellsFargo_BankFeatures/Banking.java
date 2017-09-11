package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {

    public static Actions actions = new Actions(driver);

    @FindBy(how = How.ID,using = "bankingTab")
    public static WebElement banking_features;

    @FindBy(how = How.XPATH,using = ".//*[@id='banking']/div[1]/div[2]/ul/li[3]/a")
    public static WebElement transfer;

    @FindBy(how = How.ID,using = "NID1_14_1_2_1_1_1")
    public static WebElement TransferSingIn;

    public void features()throws InterruptedException{
        Thread.sleep(1000);
        WebElement element= banking_features;
        actions.moveToElement(element).perform();
        Thread.sleep(1000);
        banking_features.click();
        transfer.click();
        TransferSingIn.click();

    }
}


