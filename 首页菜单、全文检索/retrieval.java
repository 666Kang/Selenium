package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class retrieval extends chanbase{
	//ȫ�ļ���
	@Test
	public void retrieval() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("ȫ�ļ���")).click();
		
		wd.findElement(By.id("execButton")).click();
		Thread.sleep(3000);
		
	}
}
