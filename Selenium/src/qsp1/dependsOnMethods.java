package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test(priority=1)
	public void Instagram()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Reporter.log("instagram",true);	
	}
	@Test(dependsOnMethods = "Instagram")
	public void Facebook()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Reporter.log("facebook",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "Facebook")
	public void Google()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		Reporter.log("google",true);
	}

}
