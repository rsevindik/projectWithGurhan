package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigurationReader;
import utils.Driver;

public class OrangeHrm_Login extends BasePage{

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    public void loginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperties("OrangeHrmURL"));
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    private WebElement userNameInput;

    public void getUserNameInput(){

        userNameInput.sendKeys(ConfigurationReader.getProperties("OrangeHrmUsername"));
    }

    @FindBy(xpath = "//input[@id='txtPassword']")
    private WebElement passwordInput;

    public void getPasswordInput(){
        passwordInput.sendKeys(ConfigurationReader.getProperties("OrangeHrmPassword")+ Keys.ENTER);
    }

    public boolean title (){
        Driver.getDriver().getTitle();
      return title();
    }

    @FindBy (xpath = "//*[@id='divLogo']/img")
            private WebElement homePageLogo;

    public WebElement getHomePageLogo(){

        return homePageLogo;
    }
    /*public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperties("OrangeHrmURL"));
        userNameInput.sendKeys(ConfigurationReader.getProperties("OrangeHRUsername"));
        passwordInput.sendKeys(ConfigurationReader.getProperties("OrangeHRPassword")+ Keys.ENTER);
        WebElement homePage= Driver.getDriver().findElement(By.xpath("//*[@id='divLogo']/img"));
        if (homePage.isDisplayed()){
            System.out.println("You are on the Home Page. **Login Success** ");
        }else {
            System.out.println("You are not in the homepage **Login Failed**");
            throw new RuntimeException("**Login Failed**");
            }
        }*/
    }

