package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cache1_s extends chanbase{
	//启用——开启——更新时间——保存
	
	//数据驱动
	@DataProvider(name="world")
	public static Object[][] worlds(){
		return new Object[][]{{"24"}};
	}
	
	@Test(dataProvider="world")
	public void cache(String a) throws InterruptedException{
		wd.manage().window().maximize();
		wd.get("http://10.7.90.226:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("站点")).click();
		wd.findElement(By.linkText("缓存设置")).click();
		
		wd.findElement(By.id("status1")).click();
		wd.findElement(By.id("cachePage1")).click();
		wd.findElement(By.id("cacheExpired")).clear();
		wd.findElement(By.id("cacheExpired")).sendKeys(a);
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

}
