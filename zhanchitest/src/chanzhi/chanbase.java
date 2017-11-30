package chanzhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class chanbase {
	WebDriver wd =null;
	@BeforeClass
	public void setUpBrowser(){
		System.setProperty("webdriver.gecko.driver","E:\\JAVA\\gechodriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\gechodriver\\chromedriver.exe");
		wd=new ChromeDriver();
	}
	
	@AfterClass
	public void quitBrowser(){
		if(wd != null){
			wd.quit();
		}
	}

	}
