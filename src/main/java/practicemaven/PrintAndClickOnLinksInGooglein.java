package practicemaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAndClickOnLinksInGooglein{
	static WebDriver driver;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
//	System.out.println(driver.findElement(By.xpath("//a[text()='हिन्दी']")).getText());
//	System.out.println(links.size());

//try {
//	List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
//	for(WebElement l:links) {
//		l.click();
//		driver.navigate().back();
//	}
//	
//}catch(StaleElementReferenceException e) {
//	e.printStackTrace();
//}
	
	
	PomClass p=new PomClass();
	PageFactory.initElements(driver, p);
	p.test();
driver.quit();
}
}
