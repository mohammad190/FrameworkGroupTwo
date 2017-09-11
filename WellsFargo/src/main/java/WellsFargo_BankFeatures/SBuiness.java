package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SBuiness extends CommonAPI {

    @FindBy(how = How.ID,using = "tabNavSmallBusiness")
    public static WebElement SmallBusiness;

    @FindBy(how = How.ID,using = "destination")
    public static WebElement A_Summary;

    public void SmallBuss(){
        SmallBusiness.click();
        A_Summary.click();
    }
}
