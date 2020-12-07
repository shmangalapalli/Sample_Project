import org.testng.annotations.Test;

import XSLT.Sample_Project.GoogleNavigate;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	WebDriver driver=new ChromeDriver();
	GoogleNavigate g=new GoogleNavigate();
  @Test
  public void f() {
	  g.Test1();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
