package Takes_Screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class qspiders_courses_JSE {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/search?client=firefox-b-d&q=qspiders+couses");
	driver.findElement(By.xpath("//h3[text()='Courses']")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement API = driver.findElement(By.xpath("//p[text()='API Testing']"));
	Point loc=API.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	WebElement ele=driver.findElement(By.xpath("(//span[text()='Details'])[6]"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Set<String> allwh=driver.getWindowHandles();
	ArrayList<String> a=new ArrayList<String>(allwh);
	String we=a.get(1);
	driver.switchTo().window(we);
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	WebElement tool = driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[2]"));
	Point man=tool.getLocation();
	int x1=man.getX();
	int y1=man.getY();
	js1.executeScript("window.scrollBy("+x1+","+y1+")");
	driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Screenshot\\act.jpeg");
	FileHandler.copy(src, dst);
	
}
}
