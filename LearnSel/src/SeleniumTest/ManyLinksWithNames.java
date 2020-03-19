package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManyLinksWithNames {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://amazon.com/");
		 driver.manage().window().maximize();
		 
		 List<WebElement>links=driver.findElements(By.tagName("a"));
		 System.out.println("No.of Links:"+links.size());
		 
		 for(int i=0;i<links.size();i++){
			 System.out.println("Multple Link Names are "+links.get(i).getText());
		 }
		 driver.close();
		 }
		 
		 
		 

	}


