package chanzhi;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class safe_base2 extends chanbase{
	//安全模块，基本设置
	//关闭，禁用
	@Test
	public void base() throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("基本设置")).click();
		
		wd.findElement(By.id("captcha2")).click();
		wd.findElement(By.id("checkEmail2")).click();
		wd.findElement(By.id("resetPassword2")).click();
		wd.findElement(By.id("filterFunction2")).click();
		List<WebElement> checkboxs = wd.findElements(By.name("importantValidate[]"));
//		WebElement checkBox= wd.findElement(By.name("importantValidate[]"));
		for(WebElement checkbox:checkboxs){
			if(checkbox.isSelected())
				checkbox.click();
		}
		wd.findElement(By.id("importantValidate2")).click();
		wd.findElement(By.id("front2")).click();
		wd.findElement(By.id("checkLocation2")).click();
//		wd.findElement(By.id("useLocation")).click();
		wd.findElement(By.id("checkSessionIP2")).click();
		Actions action=new Actions(wd);
		action.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		action.sendKeys("192.168.33.55").perform();
		wd.findElement(By.xpath("//input[@id='submit' and @value='保存']")).click();
		Thread.sleep(3000);
			
	}
}
