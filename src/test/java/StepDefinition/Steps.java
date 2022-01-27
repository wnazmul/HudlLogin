package StepDefinition;

import commonFunction.CmnFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageObjects;

import static org.junit.Assert.assertTrue;

public class Steps extends CmnFunction {

PageObjects pageObj=new PageObjects(driver);

    @Given("^User launch chrome browser$")
    public void user_launch_chrome_browser() throws InterruptedException {
        Thread.sleep(3000);

    }

    @When("^User Open Url \"([^\"]*)\"$")
    public void user_Open_Url(String url)  {
     driver.get(url);
    }

    @When("^User enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_email_as_and_password_as(String email, String psw) throws InterruptedException{
        pageObj.setTxtEmail(email);
        pageObj.setTxtPassword(psw);
        Thread.sleep(3000);

    }

    @When("^Click on Login button$")
    public void click_on_Login_button() throws InterruptedException {
        pageObj.setBtnLogin();
        Thread.sleep(3000);

    }

    @Then("^User should Logged in and see home page$")
    public void user_should_Logged_in_and_see_home_page() throws InterruptedException {
        Thread.sleep(3000);

    }

    @When("^User click logout$")
    public void user_click_logout() throws InterruptedException {
        pageObj.setBtnLogout();

    }

    @Then("^page tittle should be\"([^\"]*)\"$")
    public void page_tittle_should_be(String arg1) throws InterruptedException {
        String actualTile=driver.getTitle();
        String expectedTitle=arg1;
        Assert.assertEquals(actualTile,expectedTitle ,"We power sports");
        Thread.sleep(3000);

    }

    @Then("^close the Browser$")
    public void close_the_Browser()  {
    }
}
