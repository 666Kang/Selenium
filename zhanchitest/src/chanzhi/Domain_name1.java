package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Domain_name1 extends chanbase{
	//��������
	@Test
	public void Domain() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("վ��")).click();
		wd.findElement(By.linkText("��������")).click();
		wd.findElement(By.id("domain")).clear();
		wd.findElement(By.id("domain")).sendKeys("www.chanzhi.com");
		wd.findElement(By.id("allowedDomain")).clear();
		wd.findElement(By.id("allowedDomain")).sendKeys("www.chanzhi.com");
		wd.findElement(By.id("scheme1")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
}