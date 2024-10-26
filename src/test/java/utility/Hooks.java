package utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import stepDefinition.BasePage;

public class Hooks extends BasePage {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
