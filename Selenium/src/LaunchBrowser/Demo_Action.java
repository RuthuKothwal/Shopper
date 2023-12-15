package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Action {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		//driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		//WebElement src=driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		//WebElement src1=driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		//WebElement dst1=driver.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		//WebElement src2=driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		//WebElement src3=driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		//WebElement dst2=driver.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		//Actions act=new Actions(driver);
		//act.dragAndDrop(src, dst1).perform();
		//act.dragAndDrop(src1, dst1).perform();
		//act.dragAndDrop(src2, dst2).perform();
		//act.dragAndDrop(src3, dst2).perform();
		
		
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ruthu123@gmail",Keys.TAB+"Ruthu@12",Keys.TAB+"Ruthu@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}
}
