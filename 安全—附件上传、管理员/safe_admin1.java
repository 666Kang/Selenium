package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_admin1 extends chanbase{
	//����Ա��ȫѡɾ��
	@Test
	public void admin1() throws Exception{
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
		wd.findElement(By.xpath("//input[@id='submit' and @value='ɾ��']")).click();
		Thread.sleep(3000);
	}
}
