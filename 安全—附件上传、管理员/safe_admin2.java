package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_admin2 extends chanbase{
	//����Ա��ȫѡ��ѡ
	@Test
	public void admin2() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("����Ա")).click();
		
		wd.findElement(By.linkText("ȫѡ")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("��ѡ")).click();
		Thread.sleep(3000);
	}
}
