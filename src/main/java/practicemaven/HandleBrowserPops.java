package practicemaven;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserPops {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		handleBrowserPop();
		
	}
	public static void handleBrowserPop() {
		WebElement first = driver.findElement(By.linkText("Good PopUp #1"));
		first.click();
		Set<String> windowhandles = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		
		System.out.println(windowhandles.size());
		for(String w:windowhandles) {
			String title = driver.getTitle();
			driver.switchTo().window(w);
			System.out.println(title);
			driver.close();
			WebElement sec = driver.findElement(By.linkText("Good PopUp #2"));
			sec.click();
		}
	}
}
