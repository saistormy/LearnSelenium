package SeleniumTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SAI");
		 Select dropdown = new Select(driver.findElement(By.id("Skills")));
		 dropdown.selectByVisibleText("Python");
		 driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		 List<WebElement> cb =driver.findElements(By.xpath("//*[@type='checkbox']"));
		 
		 for(int i=1;i<cb.size();i++){
			 cb.get(i).click();
		 }
		 
		 
		 
		 
		 WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		 Select sel=new Select(year);
		 sel.selectByValue("1994");
		 
		 List<WebElement> yearcount=sel.getOptions();
		 System.out.println(yearcount.size());
		 for(int i=0;i<yearcount.size();i++){
			 System.out.println(yearcount.get(i).getText());
		 }
		 
		 WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		 Select sel2=new Select(month);
		 sel2.selectByVisibleText("January");
		 
		 List<WebElement> monthcount=sel2.getOptions();
		 System.out.println(monthcount.size());
		 for(int k=0;k<monthcount.size();k++){
			 System.out.println(monthcount.get(k).getText());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			 
			 WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
			 Select sel1=new Select(day);
			 sel1.selectByValue("1");
			 
			 List<WebElement> daycount=sel1.getOptions();
			 System.out.println(daycount.size());
			 for(int j=0;j<daycount.size();j++){
				 System.out.println(daycount.get(j).getText());
			 }
			 //month
			 //day
			 
		 }
		 }
	
	


