package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class sensitive1 extends chanbase{
	//敏感词设置，用户，开启
	@Test
	public void sensitive1() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("敏感词设置")).click();
		
		wd.findElement(By.linkText("用户名敏感词")).click();
		wd.findElement(By.id("filterSensitive1")).click();
		wd.findElement(By.id("sensitive")).sendKeys("苟,蛤");
		wd.findElement(By.id("submit")).click();
		
		
	}
}
