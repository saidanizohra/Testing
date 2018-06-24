package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitialzeTest ()
    {


        System.out.println("Opening the browser : Google Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zohra\\Desktop\\PFE_ ING\\driver\\chromedriver.exe");
        base.Driver = new ChromeDriver();
       // System.setProperty("webdriver.firefox.marionette","C:\\Users\\Zohra\\Desktop\\geckodriver.exe");
       // base.Driver = new FirefoxDriver();
        base.Driver.manage().window().maximize();

        base.Driver.navigate().to("http://127.0.0.1:8080/share/page/");
        base.Driver.findElement(By.name("username")).sendKeys("admin");
        base.Driver.findElement(By.name("password")).sendKeys("admin");
        base.Driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
    }

    @After
    public void TearDownTest(Scenario scenario)
    {
        if (scenario.isFailed())
        {
           //take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}