package LaunchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class countinfacebook_dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("year"));
		Select sel=new Select(ele);
		List<WebElement> opt=sel.getOptions();
		int count=opt.size();
		System.out.println(count);
		driver.close();
}
}
