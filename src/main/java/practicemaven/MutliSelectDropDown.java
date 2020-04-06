package practicemaven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutliSelectDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//li//span[@class='comboTreeItemTitle']"));
		WebElement drop=driver.findElement(By.cssSelector("input#justAnInputBox"));
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(drop));
		drop.click();
//		dropdownHandling(all, "choice 2","choice 3","choice 4");
		dropdownHandling(all, "all");
		driver.close();
	}
	
	
	public static void dropdownHandling(List<WebElement> ele,String value,String... checkbox) {
		//String... optional and  it acts like array and we can pass any number of args 
		//dropdownHandling(all, "choice 2","choice 3","choice 4");
//		dropdownHandling(all, "all");
				for(int j=0;j<ele.size();j++) {
			String text=ele.get(j).getText();
			for(int i=0;i<checkbox.length;i++) {
			if(text.equals(checkbox[i])) {
				ele.get(i).click();
				break;
			}
			}
		}
		if(value.equalsIgnoreCase("All")) {
		
		try {
			for(int i=0;i<ele.size();i++) {
				ele.get(i).click();
			}
			}catch(ElementNotInteractableException e) {
			
				System.out.println("Element not intractable because may be they are hidden");
			}
	}
	}
	

}

