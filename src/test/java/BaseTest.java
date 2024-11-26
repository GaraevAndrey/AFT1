import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver browser;
    @BeforeMethod
    public void setup() {
        // 1. открыть сайт
        //2. зайти на сайт
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        browser = new EdgeDriver(options);
        //browser.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close(){
        browser.quit();
    }
}
