package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    @BeforeClass
    public  void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //wait for the page to load
        Thread.sleep(5000);
        //maximize the page
        driver.manage().window().maximize();
        //Get the page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Locate the username field
        driver.findElement(By.id("username")).sendKeys("Oladunny21");
        //Locate the password field
        driver.findElement(By.id("password")).sendKeys("Oladunny21");
        //Locate and click the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
            Thread.sleep(20000);
            driver.quit();
    }

    //Initiate the test run command
    public  static void main(String args[]) throws InterruptedException {
        LoginTests tests = new LoginTests();
        tests.setUp();
        }
}