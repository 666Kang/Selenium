package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class sensitive2 extends chanbase{
	//用户敏感词，关闭
	@Test
	public void sensitive2() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("敏感词设置")).click();
		
		wd.findElement(By.id("filterSensitive2")).click();
		wd.findElement(By.id("submit")).click();
		
	}
}
