package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_login1 extends chanbase{
	//��¼��־����һҳ
	@Test
	public void login1() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("��¼��־")).click();
		
		wd.findElement(By.xpath("//i[@class='icon-play' and @title='��һҳ']")).click();
		
	}
}
