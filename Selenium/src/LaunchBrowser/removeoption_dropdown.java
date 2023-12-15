package LaunchBrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class removeoption_dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		int count=opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String text=we.getText();
			l.add(text);
			l.remove("Sep");
		}
		for(String t:l)
		{
			System.out.println(t);
		}
		driver.close();
}
}
