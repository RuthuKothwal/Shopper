package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/RUTHU CJ/OneDrive/Desktop/File_upload_popup.html");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\RUTHU CJ\\OneDrive\\Desktop\\Assignment Test Case.xlsx");
	}

}
