package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class integral_rules4 extends chanbase {
	//���������ַ�
	@Test 
	public void test4() throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		wd.findElement(By.linkText("����")).click();

		
		wd.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=score&f=setcounts']")).click();  //�������
		wd.findElement(By.name("register")).clear();
		wd.findElement(By.name("register")).sendKeys("$@*");
		wd.findElement(By.xpath("//input[@id='submit' and @value='����']")).click();
		Thread.sleep(3000);	
	}

}
