package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetch_id_parent_browser {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String p_id=driver.getWindowHandle();
		System.out.println(p_id);
	}

}
