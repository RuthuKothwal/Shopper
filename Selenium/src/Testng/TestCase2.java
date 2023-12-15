package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase2 extends GenericScript
{
	@Test
	public void login1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@8050");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void login2()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@8050");
		driver.findElement(By.name("login")).click();
	}
}
