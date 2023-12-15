package LaunchBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Page {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Blog']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		act.contextClick(ele1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		act.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		driver.close();
	}
}
