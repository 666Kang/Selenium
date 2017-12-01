package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CDN2 extends chanbase{
	//CDN
	@Test
	public void CDN() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("站点")).click();
		wd.findElement(By.linkText("CDN设置")).click();
		wd.findElement(By.id("open2")).click();   //禁用
//		wd.findElement(By.xpath("//span[@class='input-group-addon cdnreseter']")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
}