package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript
{
@Test
public void validLogin()
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin@8050");
	driver.findElement(By.name("login")).click();
}
}
