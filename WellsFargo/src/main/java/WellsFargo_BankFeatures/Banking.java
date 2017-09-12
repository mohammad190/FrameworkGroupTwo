package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {

    public static Actions actions = new Actions(driver);

    @FindBy(how = How.ID,using = "bankingTab")
    public static WebElement banking_features;

    @FindBy(how = How.CSS,using = ".navItemLeft>div>ul>li>a")
    public static WebElement transfer;

    public void features()throws InterruptedException{
        Thread.sleep(1000);
        WebElement element = banking_features;
        actions.moveToElement(element).perform();
        Thread.sleep(1000);
        banking_features.click();
        transfer.click();



    }
}


