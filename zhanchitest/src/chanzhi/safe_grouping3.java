package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class safe_grouping3 extends chanbase{
	//����Ȩ�ޣ��༭���з���
	@Test
	public void grouping3() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("����Ȩ��")).click();
		
		wd.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=group&f=edit&groupID=5']")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("name")).clear();
		wd.findElement(By.id("name")).sendKeys("66666");
		wd.findElement(By.id("desc")).clear();
		wd.findElement(By.id("desc")).sendKeys("����һ���µ�����");
		wd.findElement(By.id("submit")).click();
		
	}

}
