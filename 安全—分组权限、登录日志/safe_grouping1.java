package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class safe_grouping1 extends chanbase{
	//����Ȩ�ޣ��������飬�Ϸ�����
	@Test
	public void grouping1() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("����Ȩ��")).click();
		
		wd.findElement(By.linkText("��������")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("name")).sendKeys("123123");
		Actions action=new Actions(wd);
		action.sendKeys(Keys.TAB);
		action.sendKeys("�µ�����").perform();
		wd.findElement(By.id("submit")).click();
		
	}
}
