package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
  @Test
  public void tc1() {
	  
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElementById("email").sendKeys("hello3");
	  driver.findElementById("pass").sendKeys("okhello");
	  driver.quit();
	  
	  
  }
}
