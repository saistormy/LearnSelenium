package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkmethodsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//gecko
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		boolean disp1 = driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(disp1);
		
		boolean enab = driver.findElement(By.id("Email")).isEnabled();
		System.out.println(enab);
		
		if(disp1==true && enab==true){
			driver.findElement(By.id("Email")).sendKeys("saishankar522@gmail.com");
		}
		
		

	}

}
