package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class safe_validate extends chanbase{
	//��֤�����ã��Ϸ������
	@Test
	public void validate() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("��֤������")).click();
		
		wd.findElement(By.xpath("html/body/div/div[2]/form/div/div[2]/div[1]")).clear();
		wd.findElement(By.xpath("html/body/div/div[2]/form/div/div[2]/div[1]")).sendKeys("һ��һ���ڼ�");
		wd.findElement(By.id("html/body/div/div[2]/form/div/div[2]/div[1]/div[2]/input")).clear();
		wd.findElement(By.id("html/body/div/div[2]/form/div/div[2]/div[1]/div[2]/input")).sendKeys("2");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
	}
}
