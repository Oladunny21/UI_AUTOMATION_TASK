package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    @BeforeClass
    public  void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://monosnap.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //maximize the page
        driver.manage().window().maximize();

        //Get the page title
        System.out.println(driver.getTitle());

        //to clear cookies
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[3]/div[2]")).click();

        //to click on signin
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();

        //Locate the username field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("Oladunny21");

        //Locate the password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("Century211991");

        //Locate and click the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        Thread.sleep(20000);

        driver.quit();
    }

    //Initiate the test run command
    public  static void main(String args[]) throws InterruptedException {
        LoginTests tests = new LoginTests();

        tests.setUp();
    }


}


