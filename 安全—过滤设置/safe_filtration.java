package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class safe_filtration extends chanbase{
	//ip����
	@Test
	public void filtration() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("��ȫ")).click();
		wd.findElement(By.linkText("��������")).click();
		
		wd.findElement(By.linkText("ip����")).click();
		wd.findElement(By.id("interval[logonFailure]")).clear();
		wd.findElement(By.id("interval[logonFailure]")).sendKeys("2");
		wd.findElement(By.id("limits[interval][logonFailure]")).clear();
		wd.findElement(By.id("limits[interval][logonFailure]")).sendKeys("9");
//		Actions action=new Actions(wd);
//		action.sendKeys(Keys.TAB);
//		action.sendKeys("60").perform();
		Select list = new Select(wd.findElement(By.name("punishment[interval][logonFailure]")));
		list.selectByValue("60");
		wd.findElement(By.id("limits[day][logonFailure]")).clear();
		wd.findElement(By.id("limits[day][logonFailure]")).sendKeys("200");
		Select droplist =new Select(wd.findElement(By.name("punishment[day][logonFailure]")));
		droplist.selectByValue("60");
		wd.findElement(By.xpath("//input[@id='submit' and @value='����']")).click();
		Thread.sleep(3000);
		
	}
}
