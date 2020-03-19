package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTextMsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3=driver.switchTo().alert();
		String alertmsgg=driver.switchTo().alert().getText();
		System.out.println(alertmsgg);
		Thread.sleep(6000);
		alert3.sendKeys("Hello");
		Thread.sleep(6000);
		alert3.accept();
		
		driver.close();
		
		
		

	}

}
