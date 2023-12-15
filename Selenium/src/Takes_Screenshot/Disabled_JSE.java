package Takes_Screenshot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabled_JSE {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU%20CJ/OneDrive/Desktop/Disabled_JSE.html");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('a1').value=''");
		Thread.sleep(1000);
		driver.close();
}
}
