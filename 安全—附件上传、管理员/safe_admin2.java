package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_admin2 extends chanbase{
	//管理员，全选反选
	@Test
	public void admin2() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("管理员")).click();
		
		wd.findElement(By.linkText("全选")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("反选")).click();
		Thread.sleep(3000);
	}
}
