package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

class registration2 extends chanbase{
	//注册协议——关闭
	@Test
	public void registration() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("注册协议")).click();
		
		wd.findElement(By.id("agreement2")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

}
