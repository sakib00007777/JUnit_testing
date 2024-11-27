package sakib126;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EdgeTest extends commonTest{
//public WebDriver driver;
//public Map<String, Object> vars;
//JavascriptExecutor js;
//@BeforeMethod
//public void setUp() {
//	System.setProperty("webdriver.Edge.driver", "C:\\Users\\Sakib\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
// driver = new EdgeDriver();
// js = (JavascriptExecutor) driver;
// vars = new HashMap<String, Object>();
//}
// @AfterMethod
// public void tearDown() {
//   driver.quit();
// }
@Test
public void signuptest() {
 driver.get("https://katalon-demo-cura.herokuapp.com/");
 driver.manage().window().setSize(new Dimension(1552, 840));
 driver.findElement(By.cssSelector(".fa-bars")).click();
 driver.findElement(By.linkText("Login")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1)")).click();
 driver.findElement(By.id("txt-username")).click();
 driver.findElement(By.id("txt-username")).sendKeys("John Doe");
 driver.findElement(By.cssSelector(".alert > .form-group:nth-child(2)")).click();
 driver.findElement(By.id("txt-password")).click();
 driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
 driver.findElement(By.id("txt-username")).click();
 driver.findElement(By.id("txt-username")).sendKeys("John Do");
 driver.findElement(By.id("btn-login")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1)")).click();
 driver.findElement(By.id("txt-username")).click();
 driver.findElement(By.id("txt-username")).sendKeys("John Doe");
 driver.findElement(By.cssSelector(".alert > .form-group:nth-child(2)")).click();
 driver.findElement(By.id("txt-password")).click();
 driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
 driver.findElement(By.cssSelector("#login .row")).click();
 driver.findElement(By.id("btn-login")).click();
 driver.findElement(By.cssSelector(".fa-bars")).click();
 driver.findElement(By.linkText("Logout")).click();
}

//@AfterMethod
//public void tearDown() {
// driver.quit();
}

