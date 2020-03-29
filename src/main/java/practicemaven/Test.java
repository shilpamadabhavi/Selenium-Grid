package practicemaven;

public class Test {
public static void main(String[] args) {
	WebDriverManagerexample w=new WebDriverManagerexample();
	w.launchBrowser();
	w.launchUrl("http://www.google.com");
	w.doGetTitle();
}
}
