package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class safe_admin3 extends chanbase{
	//管理员，搜索
	@Test
	public void admin3() throws Exception{
		wd.manage().window().maximize();
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("管理员")).click();
		
		wd.findElement(By.id("user")).sendKeys("admin");
		Thread.sleep(3000);
		Actions action=new Actions(wd);
//		wd.findElement(By.xpath("//input[@value='搜索']")).click();
		action.sendKeys(Keys.TAB);
		Thread.sleep(3000);
//		action.sendKeys(Keys.ENTER).perform();
//		action.click().perform();
	
		
		
	}
}
