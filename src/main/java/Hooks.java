import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    public WebDriver driver;

    /*private ExtentSparkReporter extentSparkReporter;

    public ExtentReports extentReports;

    public static ExtentTest extentTest; */

    //@BeforeClass
    @BeforeMethod
    public void setUp() {
        /*extentSparkReporter = new ExtentSparkReporter("extentReports.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter); */
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Patricia\\Desktop\\Teste automate\\Proiect Final Patricia\\Proiect Final Patricia\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fasttrackit-test.netlify.app/#/");

    }

    //@AfterClass
    @AfterMethod
    public void tearDown() {
        driver.quit();
       // extentReports.flush();
    }
}
