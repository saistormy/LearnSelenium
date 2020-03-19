package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 driver.findElement(By.className("ico-register")).click();
		 Thread.sleep(300);
		 driver.navigate().back();
		 Thread.sleep(300);
		 driver.navigate().forward();
		 Thread.sleep(300);
		 driver.navigate().to("http://demowebshop.tricentis.com/");
		 Thread.sleep(300);
		 driver.navigate().refresh();
		 Thread.sleep(300);
		 driver.close();
		 
		 

	}

}
