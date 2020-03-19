package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		String alertmsg=driver.switchTo().alert().getText();
		Thread.sleep(3000);
		System.out.println(alertmsg);
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		
		

	}

}
