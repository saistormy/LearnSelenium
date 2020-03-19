package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\007\\Selenium\\JarFiles\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");

	}

}
