package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_white1 extends chanbase{
	//白名单管理，内容均为空
	@Test
	public void white() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("白名单管理")).click();
		
		wd.findElement(By.id("submit")).click();
		
		
		
	}

}
