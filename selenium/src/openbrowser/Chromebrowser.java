package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chromebrowser {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\saravananan\\eclipse-workspace\\Java\\selenium\\Drivers\\chromedriver.exe");
			/*
			 * // WebDriver driver = new EdgeDriver(); //WebDriver driver = new
			 * ChromeDriver(); ChromeOptions obj=new ChromeOptions(); ChromeDriver driver =
			 * new ChromeDriver(obj); driver.manage().window().maximize();
			 * driver.get("https://www.makemytrip.com/");
			 */

		   ChromeOptions options = new ChromeOptions();
			//options.addExtensions(new File("X://extension_3_40_1_0.crx")); 
			//DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			//options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();

	    }
	}

