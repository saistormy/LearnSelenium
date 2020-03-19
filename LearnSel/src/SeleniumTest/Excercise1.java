package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 
		 String title=driver.getTitle();
		 int pagelength=title.length();
		 System.out.println("page title"+title);
		 System.out.println("Page Length"+pagelength);
		 
		 String ExpectedURL="http://demowebshop.tricentis.com/";
		 String ActualURL=driver.getCurrentUrl();
		 System.out.print(ActualURL);
		 
		 if(ExpectedURL.equals(ActualURL)){
			 System.out.println("\nCorrect Page Opened");
		 }
		 else
		 {
			 System.out.println("\nIncorrect Page Opened");
			 
		 }
		 String source=driver.getPageSource();
		 System.out.println(source);
		 System.out.println("\nSource Length\n"+source.length());
		 
		 
		 System.out.println("Page URL is "+ driver.getCurrentUrl());
		 driver.close();

	}

}
