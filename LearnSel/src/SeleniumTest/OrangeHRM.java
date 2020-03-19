package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit Wait
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 
		 WebDriverWait MyWait=new WebDriverWait(driver,10);//explicit Wait
		 MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		 driver.findElement(By.xpath("//a[@id='welcome']")).click();
		 
		 WebDriverWait Mywait1=new WebDriverWait(driver,10);//explicit wait
		 Mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

}
