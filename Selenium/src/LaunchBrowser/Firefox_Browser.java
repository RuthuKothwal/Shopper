package LaunchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser {
	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}

}
