package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class integral_settlement extends chanbase {
	//���ֽ���
	@Test
	public void test1() throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
//		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("���ֽ���")).click();
		wd.findElement(By.xpath("//input[@id='submit' and @value='���ֽ���']")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}
		
}