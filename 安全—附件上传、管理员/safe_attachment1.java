package chanzhi;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class  safe_attachment1 extends chanbase{
	//附件上传，允许上传，合法内容
	@Test 
	public void attachment1()  throws Exception{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("设置")).click();
		wd.findElement(By.linkText("安全")).click();
		wd.findElement(By.linkText("附件上传")).click();
		
		List<WebElement> checkboxs = wd.findElements(By.name("allowUpload")) ;
		for(WebElement checkbox:checkboxs){
			if(checkbox.isSelected()){
				checkbox.click();			}
		}
		wd.findElement(By.name("allowUpload")).click();
		wd.findElement(By.id("allowedFiles")).clear();
		wd.findElement(By.id("allowedFiles")).sendKeys(",txt,doc,docx,dot,wps,wri,pdf,ppt,xls,xlsx,ett,xlt,xlsm,csv,jpg,jpeg,png,psd,gif,ico,bmp,swf,avi,rmvb,rm,mp3,mp4,3gp,flv,mov,movie,rar,zip,bz,bz2,tar,gz,");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
	}
}
