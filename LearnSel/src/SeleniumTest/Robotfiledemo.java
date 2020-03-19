package SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotfiledemo {

	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        
        Robot robot=new Robot();
        
        driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
        robot.setAutoDelay(3000);
       // driver.manage().window().setSize(new Dimension(400,500));
        
        StringSelection stringselect=new StringSelection("D:\\Sai Shankar Sunkara.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

	}

}
