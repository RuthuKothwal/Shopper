package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert extends GenericScript
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@8050");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		//System.out.println(title);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "Facebook");
		System.out.println("1");
		sa.assertAll();
	}
	@Test
	public void test1()
	{
		System.out.println("true");
	}
}

