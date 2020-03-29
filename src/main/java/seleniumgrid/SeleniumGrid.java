package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/*CODE:
 * 1/Give the address /URL of
 * 2.desired capabillity
 * 3.Chrome options to launch browser
 * Hub:1.selenium jar
 * 2.start server on hub
 * Node:selenium jar,chrome browser
 * 2.Regiter node with hub(make connection with hub)
 * 3.Web App launch bcz browser is der
 * 4..chromedriiver.exe
 */
public class SeleniumGrid {
	public static void main(String[] args) throws MalformedURLException {
		
//		1.define DesiredCapabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);//optional
		
//		2. Chrome options definistion
//		ChromeOptions options=new ChromeOptions();
//		options.merge(cap);
		
		String hubUrl="http://192.168.1.4:4444/wd/hub";//to run on the diff computer u shud give node comp ip address and port no
		//same computer u can give localhost:port number in place of ip or u can give ip
//		WebDriver driver=new RemoteWebDriver(new URL(hubUrl), options);//after 3.8 selenium we need to use chrome options
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl), cap);
		driver.get("https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html");
		System.out.println(driver.getTitle());
//		driver.quit();
		
	}

}
