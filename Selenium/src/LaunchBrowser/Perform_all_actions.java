package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_all_actions {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU%20CJ/OneDrive/Desktop/dummypage.html");
		WebElement ele=driver.findElement(By.xpath("//input[@id='a1']"));
		boolean b=ele.isEnabled();
		if(b)
		{
			System.out.println("element enabled");
		}
		else
		{
			System.out.println("element not enabled");
		}
	}

}
