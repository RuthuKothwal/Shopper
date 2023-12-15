package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_or_single {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU%20CJ/OneDrive/Desktop/citydropdown_handling.html");
		WebElement drop_down=driver.findElement(By.xpath("//select[@id='city-dropdown']"));
		Select sel=new Select(drop_down);
		if(sel.isMultiple())
		{
			System.out.println("Multiple select");
		}
		else
		{
			System.out.println("Single select");
		}
}
}
