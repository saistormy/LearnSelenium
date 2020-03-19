package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://demowebshop.tricentis.com/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("Email")).sendKeys("saishankar522@gmail.com");
		 driver.findElement(By.name("Password")).sendKeys("Momdadme@007");
		 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 
		 String ExpectedResult="Demo web Shop";
		 String ActualResult=driver.getTitle();
		 System.out.print(ActualResult);
		 
		 if(ExpectedResult.equals(ActualResult)){
			 System.out.println("\nSucess");
		 }
		 else
		 {
			 System.out.println("\nFailure");
			 
		 }
		 
		 driver.findElement(By.linkText("Log out")).click();
		 //driver.close();Will Close Current Active Window Opened By Selenium
		 //driver.quit();Will Close Multiple Active Windows Opened By Selenium
		 
	}

}
