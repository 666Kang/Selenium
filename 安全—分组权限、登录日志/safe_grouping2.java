package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class safe_grouping2 extends chanbase{
	//分组权限，删除分组
		@Test
		public void grouping2() throws Exception{
			wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
			Thread.sleep(3000);
			wd.findElement(By.name("account")).sendKeys("admin");
			wd.findElement(By.name("password")).sendKeys("admin");
			wd.findElement(By.id("submit")).click();
			Thread.sleep(3000);
			wd.findElement(By.linkText("设置")).click();
			wd.findElement(By.linkText("安全")).click();
			wd.findElement(By.linkText("分组权限")).click();
			
			wd.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=group&f=delete&groupID=5']")).click();
			Thread.sleep(1000);
			wd.findElement(By.xpath("//button[@class='btn btn-primary' and test()='确认']")).click();
			
		}
}
