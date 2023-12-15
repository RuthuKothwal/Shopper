package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8975623884");
		WebElement we1=driver.findElement(By.xpath("//select[@id='select2']"));
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("Female");
		WebElement we2=driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel2=new Select(we2);
		sel2.selectByVisibleText("India");
		WebElement we3=driver.findElement(By.xpath("//select[@id='select5']"));
		Select sel3=new Select(we3);
		sel3.selectByVisibleText("Karnataka");
		//WebElement we4=driver.findElement(By.xpath("//select[text()='Select City']"));
		//Select sel4=new Select(we4);
		//sel4.selectByVisibleText("Mysore");
		driver.findElement(By.xpath("//button[@id='continuebtn']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		driver.findElement(By.xpath("//input[@id='keypoint']")).sendKeys("8975623884");
		WebElement we4=driver.findElement(By.xpath("(//select[@id='select40'])[1]"));
		Select sel4=new Select(we4);
		sel4.selectByVisibleText("Female");
		WebElement we5=driver.findElement(By.xpath("//select[@id='mul']"));
		Select sel5=new Select(we5);
		sel5.selectByVisibleText("India");
		sel5.selectByVisibleText("United States");
		sel5.selectByVisibleText("Canada");
		WebElement we6=driver.findElement(By.xpath("//select[@id='selectstate']"));
		Select sel6=new Select(we6);
		sel6.selectByVisibleText("Karnataka");
		sel6.selectByVisibleText("Rajasthan");
		sel6.selectByVisibleText("Tamilnadu");
		WebElement we7=driver.findElement(By.xpath("//select[@id='select40' and @multiple=\"\"]"));
		Select sel7=new Select(we7);
		sel7.selectByVisibleText("Mumbai");
		sel7.selectByVisibleText("Delhi");
		sel7.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
