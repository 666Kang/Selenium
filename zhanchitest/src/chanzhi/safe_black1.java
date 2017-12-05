package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_black1 extends chanbase{
	//黑名单，添加黑名单,内容空直接保存
	@Test
	public void black() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("黑名单管理")).click();
		
		wd.findElement(By.linkText("添加黑名单")).click();
		wd.findElement(By.xpath("//input[@id='submit' and @value='保存']")).click();
		Thread.sleep(3000);		
	}
}
