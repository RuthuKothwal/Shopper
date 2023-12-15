package LaunchBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_page_Arraylist {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3=driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4=driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> l=new ArrayList<WebElement>(); 
		l.add(ele);
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		for(WebElement we:l)
		{
			Actions act=new Actions(driver);
			act.contextClick(we).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyPress(KeyEvent.VK_T);
		}
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(allwh);
		String we=a.get(3);
		driver.switchTo().window(we);
		
	}
}
