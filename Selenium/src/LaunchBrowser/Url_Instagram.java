package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_Instagram {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String s1="https://www.facebook.com/";
		if(s.equals(s1))
		{
			System.out.println("Url is matching");
		}
		else
		{
			System.out.println("Url is not matching");
		}

}
}
