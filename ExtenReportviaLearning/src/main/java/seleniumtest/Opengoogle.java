package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Opengoogle {

	public static void main(String[] args) {

System.setProperty("WebDriver.edge.driver", "C:\\Users\\saravananan\\Downloads\\edgedriver_win64 (1)");

WebDriver driver = new EdgeDriver();
driver.get("https://www.google.co.in/");
	}

}
