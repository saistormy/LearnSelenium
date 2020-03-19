package SeleniumTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		log.info("URL Launched");
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("page title"+title);
		log.warn("Check Title");
		
		
		 
		 if(title.equals("Google")){
			 System.out.println("\nCorrect Page Opened");
			 log.info("The URL is Correct");
		 }
		 else
		 {
			 System.out.println("\nIncorrect Page Opened");
			 log.error("The URL is Not Correct");
			 
		 }
	}

}
