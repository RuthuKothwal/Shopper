package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hoverAction {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		WebElement men=driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
}
}
