package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("file:///D:/007/Selenium/JarFiles/toolstable.html");
			String toolname = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
			System.out.println("The Tool name is:"+toolname);
	}

}
