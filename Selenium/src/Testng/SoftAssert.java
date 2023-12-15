package Testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert extends GenericScript
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@8050");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals(title, "Facebook");
	    System.out.println("1");
	}
	@Test
	public void test1()
	{
		System.out.println("true");
	}
}
