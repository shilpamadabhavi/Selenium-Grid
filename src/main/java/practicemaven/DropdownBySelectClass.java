package practicemaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBySelectClass {
	static WebDriver driver;
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String date="20-Dec-2019";
	String[] s = date.split("-");
	String day = s[0];
	String month = s[1];
	String year = s[2];
	WebElement dayelement = driver.findElement(By.id("day"));
	WebElement monthelement = driver.findElement(By.id("month"));
	WebElement yearelement = driver.findElement(By.id("year"));
//	selectByUsingGetOptions(dayelement,day);
//	selectByUsingGetOptions(monthelement,month);
//	selectByUsingGetOptions(yearelement,year);
	
	
	By days=By.xpath("//select[@id='day']/option");
	By months=By.xpath("//select[@id='month']/option");
	By years=By.xpath("//select[@id='year']/option");
	selectDropDownWithoutusingSelectclass(days,day);
	selectDropDownWithoutusingSelectclass(months,month);
	selectDropDownWithoutusingSelectclass(years,year);
	driver.quit();
	}

public static void selectByUsingGetOptions(WebElement element,String date) {
	Select select=new Select(element);
	List<WebElement> options = select.getOptions();
	for(WebElement opt:options) {
		if(opt.getText().equals(date)) {
		opt.click();
		}
	}
}


public static void selectDropDownWithoutusingSelectclass(By locator,String date) {
	List<WebElement> days = driver.findElements(locator);
	for(WebElement ele:days) {
		if(ele.getText().equals(date)) {
			ele.click();
		}
	}
	
}
}
