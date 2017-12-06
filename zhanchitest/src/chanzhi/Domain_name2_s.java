package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Domain_name2_s extends chanbase{
	//域名设置,https
	
	//数据驱动
	@DataProvider(name="world")
	public static Object[][] worlds(){
		return new Object[][]{{"www.chanzhi.com","www.chanzhi.com"}};
	}
		
	@Test(dataProvider = "world")
	public void Domain(String a,String b) throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("站点")).click();
		wd.findElement(By.linkText("域名设置")).click();
		wd.findElement(By.id("domain")).clear();
		wd.findElement(By.id("domain")).sendKeys(a);
		wd.findElement(By.id("allowedDomain")).clear();
		wd.findElement(By.id("allowedDomain")).sendKeys(b);
		wd.findElement(By.id("scheme2")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
}