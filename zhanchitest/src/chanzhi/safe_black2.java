package chanzhi;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_black2 extends chanbase{
	//����������Ӻ��������Ϸ�����

	

		
	@Test
	public void black() throws Exception{
		wd.manage().window().maximize();
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("����������")).click();
		
		wd.findElement(By.linkText("��Ӻ�����")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("identity")).sendKeys("һ����");
	
		wd.findElement(By.id("reason")).sendKeys("666");
		wd.findElement(By.xpath("//input[@id='submit' and @value='����']")).click();
		Thread.sleep(3000);	
	}
}
