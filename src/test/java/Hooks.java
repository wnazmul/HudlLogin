import commonFunction.CmnFunction;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    CmnFunction cmnFunction=new CmnFunction();
    @Before
    public void beforeTest()
    {
        cmnFunction.openBrowser();
    }
    @After
    public void afterTest()
    {
        cmnFunction.closeBrowser();
    }
}
