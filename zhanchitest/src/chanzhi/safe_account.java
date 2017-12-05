package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class safe_account extends chanbase{
	//账号过滤
	@Test
	public void account() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("过滤设置")).click();
		
		wd.findElement(By.linkText("帐号过滤")).click();
		wd.findElement(By.id("interval[resetPWDFailure]")).clear();
		wd.findElement(By.id("interval[resetPWDFailure]")).sendKeys("2");
		wd.findElement(By.id("limits[interval][resetPWDFailure]")).clear();
		wd.findElement(By.id("limits[interval][resetPWDFailure]")).sendKeys("9");
		Select list = new Select(wd.findElement(By.name("punishment[interval][resetPWDFailure]")));
		list.selectByValue("30");
		wd.findElement(By.id("limits[day][resetPWDFailure]")).clear();
		wd.findElement(By.id("limits[day][resetPWDFailure]")).sendKeys("25");
		Select droplist=new Select(wd.findElement(By.name("punishment[day][resetPWDFailure]")));
		droplist.selectByValue("30");
		
		wd.findElement(By.xpath("//input[@id='submit' and @value='保存']")).click();
		Thread.sleep(3000);
		
	}
}
