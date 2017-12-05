package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_validate2 extends chanbase{
	//添加，删除
	@Test
	public void validate2() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("验证码设置")).click();
		
		wd.findElement(By.xpath("//form[@id='ajaxForm']/div/div[2]/div[3]/i and class='icon-plus'")).click();
		wd.findElement(By.xpath("//form[@id='ajaxForm']/div/div[2]/div[3]/i and class='icon-remove'")).click();
	} 
}
