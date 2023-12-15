package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMaps {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		driver.findElement(By.xpath("//input[@spellcheck='false' and @tooltip='Choose starting point, or click on the map...']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @placeholder='Choose destination...']")).sendKeys("Hassan");
		
	}

}
