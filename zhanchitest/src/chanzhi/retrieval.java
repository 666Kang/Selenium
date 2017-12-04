package chanzhi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class retrieval extends chanbase{
	//全文检索
	@Test
	public void retrieval() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("全文检索")).click();
		
		wd.findElement(By.id("execButton")).click();
		Thread.sleep(3000);
		
	}
}
