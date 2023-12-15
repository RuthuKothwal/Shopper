package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		Thread.sleep(1000);
		WebElement drop_down=driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement drop_down1=driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement drop_down2=driver.findElement(By.xpath("//select[@title='Year']"));
		Thread.sleep(1000);
		Select sel1=new Select(drop_down);
		sel1.selectByVisibleText("7");
		Thread.sleep(1000);
		Select sel2=new Select(drop_down1);
		sel2.selectByVisibleText("Oct");
		Thread.sleep(1000);
		Select sel3=new Select(drop_down2);
		sel3.selectByVisibleText("2000");
		
}
}
