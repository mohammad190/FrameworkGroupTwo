package Twitter_Features;


import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class T_HomePage extends CommonAPI {

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement Sports;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement News;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement Music;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement Entertainment;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement Lifestyle;

    @FindBy(how = How.CSS,using = ".StreamsCategoryBar-itemName")
    public static WebElement More;

    public void HomePage1(){
        Sports.click();
    }
    public void HomePage2(){
        News.click();
    }

    public void HomePage3(){
        Music.click();
    }
    public void HomePage4(){
        Entertainment.click();
    }
    public void HomePage5(){
        Lifestyle.click();
    }
    public void HomePage6(){
        More.click();
    }

}
