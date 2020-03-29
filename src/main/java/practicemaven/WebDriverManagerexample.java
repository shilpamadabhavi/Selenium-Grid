package practicemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerexample {
	
	
	WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public String doGetTitle() {
		return driver.getTitle();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}