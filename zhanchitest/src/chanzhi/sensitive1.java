package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class sensitive1 extends chanbase{
	//���д����ã��û�������
	@Test
	public void sensitive1() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("���д�����")).click();
		
		wd.findElement(By.linkText("�û������д�")).click();
		wd.findElement(By.id("filterSensitive1")).click();
		wd.findElement(By.id("sensitive")).sendKeys("��,��");
		wd.findElement(By.id("submit")).click();
		
		
	}
}
