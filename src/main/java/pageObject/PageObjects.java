package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {

    //Elements
    @FindBy(id="email")
    WebElement txtEmail;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"logIn\"]")
    WebElement btnLogin;



    @FindBy(xpath = "//*[@id=\"ssr-webnav\"]/div/div[1]/nav[1]/div[4]/div[2]/div[1]/div[1]/div/div")
    WebElement btnLogout;

 //Constructor
public PageObjects(WebDriver driver){
    PageFactory.initElements(driver, this);

}

// Methods

   public void setTxtEmail(String email){
    txtEmail.sendKeys(email);
   }

   public void setTxtPassword(String psw){
    txtPassword.sendKeys(psw);

   }
   public void setBtnLogin(){
    btnLogin.click();
   }
   public void setBtnLogout(){

    btnLogout.click();
   }
}
