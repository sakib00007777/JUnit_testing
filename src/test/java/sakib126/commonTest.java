package sakib126;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class commonTest {
	public WebDriver driver;
	public Map<String, Object> vars;
	JavascriptExecutor js;
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser ) throws Exception {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakib\\Downloads\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.Edge.driver", "C:\\Users\\Sakib\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sakib\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	else {
		throw new Exception("browser not found");
	}
	 js = (JavascriptExecutor) driver;
	 vars = new HashMap<String, Object>();
	}
	public void tearDown() {
		 driver.quit();
}
}
