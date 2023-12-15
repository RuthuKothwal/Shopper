package LaunchBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_login_switch {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//input[@name='email']"));
		ele.sendKeys("ruthu456@gmail.com",Keys.TAB+"12345",Keys.ENTER);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		String wh=l.get(1);
		driver.switchTo().window(wh);
		
		
	}
	
}
