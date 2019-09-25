package demo2.hac2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserClass {
	static WebDriver driver;
		public static WebDriver openBrowser(String browser)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe");
				driver = new ChromeDriver();
				driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			}
			
			
			else
				System.out.println("Invalid browser !!");
			return driver;
		}
		

	}



