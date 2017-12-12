package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registration1_1_s extends chanbase{
	//注册协议——开启——标题合法、内容合法
	
	//数据驱动
	@DataProvider(name="world")
	public static Object[][] worlds(){
		return new Object[][]{{"设置注册协议","合法的内容"}};
	}
	
	@Test(dataProvider="world")
	public void registration(String a,String b) throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("注册协议")).click();
		
		wd.findElement(By.id("agreement1")).click();
		wd.findElement(By.id("agreementTitle")).clear();
		wd.findElement(By.id("agreementTitle")).sendKeys(a);
		//iframe文本框
		Actions action = new Actions(wd);
		action.sendKeys(Keys.TAB);
//		action.clear().perform();
		action.sendKeys(b).perform();
		
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
}
