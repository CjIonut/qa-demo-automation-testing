import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ComplexTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testValidLogin() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement message = driver.findElement(By.className("post-title"));
        Assert.assertTrue(message.getText().contains("Logged In Successfully"));
    }

    @Test
    public void testLogoutFunctionality() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement logoutButton = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logoutButton.isDisplayed());

        logoutButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("practice-test-login"));
    }

    @Test
    public void testProtectedPageAccess() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        driver.get("https://practicetestautomation.com/logged-in-successfully/");
        WebElement protectedHeader = driver.findElement(By.className("post-title"));
        Assert.assertTrue(protectedHeader.getText().contains("Logged In Successfully"));
    }

    @Test
    public void testInvalidLoginErrorMessage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpass");
        driver.findElement(By.id("submit")).click();

        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertEquals(errorMessage.getText(), "Your username is invalid!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
