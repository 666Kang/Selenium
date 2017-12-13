package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_login3 extends chanbase{
	//登录日志，更改每页条数
			@Test
			public void login3() throws Exception{
				wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
				Thread.sleep(3000);
				wd.findElement(By.name("account")).sendKeys("admin");
				wd.findElement(By.name("password")).sendKeys("admin");
				wd.findElement(By.id("submit")).click();
				Thread.sleep(3000);
				wd.findElement(By.linkText("设置")).click();
				wd.findElement(By.linkText("安全")).click();
				wd.findElement(By.linkText("登录日志")).click();
				
				wd.findElement(By.id("_recPerPage")).click();
				wd.findElement(By.xpath("//a[@href='javascript:submitPage(\"changeRecPerPage\", 45)']")).click();
					
			}
}
