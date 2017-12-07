package chanzhi;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class site_s extends chanbase {
	//站点设置
	
	//数据驱动
	@DataProvider(name="world")
	public static Object[][] worlds(){
		return new Object[][]{{"蝉知门户网","2013","企业门户系统 企业建站系统 开源CMS","企业门户系统 企业建站系统 开源CMS","为天下企业提供专业的营销工具！"}};
	}	
	@Test(dataProvider="world")
	public void test1(String a,String b,String c,String d,String e) throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("站点")).click();
		wd.findElement(By.linkText("站点设置")).click();
		
		
		wd.findElement(By.xpath("//input[@name='status' and @value='normal']")).click();
		wd.findElement(By.xpath("//input[@name='type' and @value='portal']")).click();
		wd.findElement(By.xpath("//input[@name='mobileTemplate' and @value='open']")).click();
		wd.findElement(By.xpath("//input[@name='gzipOutput' and @value='open']")).click();
		wd.findElement(By.id("name")).clear();
		wd.findElement(By.id("name")).sendKeys(a);
		wd.findElement(By.id("copyright")).clear();
		wd.findElement(By.id("copyright")).sendKeys(b);
		wd.findElement(By.id("modules1")).click();
		wd.findElement(By.xpath("//input[@id='modules1' and @value='article']")).click();
		wd.findElement(By.xpath("//input[@id='modules2' and @value='blog']")).click();
		wd.findElement(By.xpath("//input[@id='modules3' and @value='score']")).click();
		wd.findElement(By.xpath("//input[@id='modules1' and @value='search']")).click();
		wd.findElement(By.id("keywords")).clear();
		wd.findElement(By.id("keywords")).sendKeys(c);
		wd.findElement(By.id("indexKeywords")).clear();
		wd.findElement(By.id("indexKeywords")).sendKeys(d);
		wd.findElement(By.id("slogan")).clear();
		wd.findElement(By.id("slogan")).sendKeys(e);
		wd.findElement(By.id("submit")).click();   //保存
		Thread.sleep(3000);
			
	}

}
