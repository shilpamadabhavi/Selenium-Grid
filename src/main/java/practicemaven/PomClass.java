package practicemaven;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomClass {
	
@FindBy(xpath=("//div[@id='SIvCob']//a"))
private List<WebElement> list; 


public void test() {
	for(WebElement l:list) {
		l.click();
	}
}
}
