package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fivetimesname {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU%20CJ/OneDrive/Desktop/fivetimesname.html");
		Thread.sleep(2000);
		List<WebElement> text=driver.findElements(By.xpath("//input[@value='Ruthu']"));
		int count=text.size();
		System.out.println(count);
		for(int i=count-1;i>=0;i--) 
		{
			WebElement we=text.get(i);
			we.clear();
			Thread.sleep(2000);
			}
		
}
}
