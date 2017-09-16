package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loans_Credit extends CommonAPI {

    @FindBy(how = How.ID,using = "loansTab")
    public static WebElement click_loans_Tab_1;

    @FindBy(how = How.LINK_TEXT,using = "Mortgage Loans")
    public static WebElement click_Mortgage_Loan_2;

    @FindBy(how = How.LINK_TEXT,using = "Personal Lines and Loans")
    public static WebElement click_personal_lines_Loans_3;

    @FindBy(how = How.LINK_TEXT,using = "Student Loans")
    public static WebElement click_Student_loans_4;

    @FindBy(how = How.LINK_TEXT,using = "Auto Loans")
    public static WebElement click_Auto_Loans_5;

    @FindBy(how = How.LINK_TEXT,using = "Credit Cards")
    public static WebElement click_Credit_Cards_6;

    @FindBy(how = How.LINK_TEXT,using = "Apply Now")
    public static WebElement click_applyNow_7;

    @FindBy(how = How.ID,using = "j_username")
    public static WebElement click_User_Name_8;

    @FindBy(how = How.ID,using = "j_password")
    public static WebElement click_password_9;

    @FindBy(how = How.ID,using = "continue")
    public static WebElement click_Continue_10;

    public static void Features_Loans_Credit()throws InterruptedException{
        Actions action = new Actions(driver);
        WebElement element = click_loans_Tab_1;
        action.moveToElement(element).perform();

        click_Mortgage_Loan_2.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_personal_lines_Loans_3.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_Student_loans_4.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_Auto_Loans_5.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_Credit_Cards_6.click();
        driver.navigate().back();
        action.moveToElement(element).perform();
//        click_applyNow_7.click();
//        click_User_Name_8.sendKeys(Name);
//        click_password_9.sendKeys(Password);
//        click_Continue_10.sendKeys();
    }
}
