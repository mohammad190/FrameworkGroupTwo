package TestCase;

import WellsFargo_BankFeatures.Banking;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_banking extends CommonAPI {
    @Test
    public void banking() throws InterruptedException {

        Banking banking = PageFactory.initElements(driver,Banking.class);
        banking.features();

    }
}
