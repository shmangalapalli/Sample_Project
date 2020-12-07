package XSLT.Sample_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigate {
	
	public void Test1()
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\Shalini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
	}

	

}
