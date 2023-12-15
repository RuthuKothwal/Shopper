package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU%20CJ/OneDrive/Desktop/keys.html");
		WebElement ele1=driver.findElement(By.id("a1"));
		WebElement ele2=driver.findElement(By.id("a2"));
		WebElement ele3=driver.findElement(By.id("a3"));
					
		ele1.sendKeys(Keys.CONTROL+"a"+"x");
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		ele2.sendKeys(Keys.CONTROL+"a"+"x");
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		ele3.sendKeys(Keys.CONTROL+"a"+"x");
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
	}
}