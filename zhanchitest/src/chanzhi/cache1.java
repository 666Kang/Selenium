package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class cache1 extends chanbase{
	//启用——开启——更新时间——保存
	@Test
	public void cache1() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
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
		wd.findElement(By.id("cacheExpired")).sendKeys("24");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

}
