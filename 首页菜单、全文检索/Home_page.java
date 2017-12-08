package chanzhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home_page extends chanbase{
	//首页菜单
	@Test
	public void Home() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("站点")).click();
		wd.findElement(By.linkText("首页菜单")).click();
		
		List<WebElement> checkboxs = wd.findElements(By.name("homeMenus[]"));   //相当于把一个列表的值传入checkboxs中
		for(WebElement checkbox:checkboxs){  //webelement类型的CheckBox值，for循环遍历checkboxs里面的东西
		if(checkbox.isSelected()){           //判断checkbox是不是被选中，如果是，就点击一下取消选中
			checkbox.click();
			}
		}
		wd.findElement(By.id("homeMenus1")).click();
		wd.findElement(By.id("homeMenus2")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
	}
}
