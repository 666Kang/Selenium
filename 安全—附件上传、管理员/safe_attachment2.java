package chanzhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class safe_attachment2 extends chanbase{
	//�����ϴ����������ϴ���������
		@Test 
		public void attachment1()  throws Exception{
			wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
			Thread.sleep(3000);
			wd.findElement(By.name("account")).sendKeys("admin");
			wd.findElement(By.name("password")).sendKeys("admin");
			wd.findElement(By.id("submit")).click();
			Thread.sleep(3000);
			wd.findElement(By.linkText("����")).click();
			wd.findElement(By.linkText("��ȫ")).click();
			wd.findElement(By.linkText("�����ϴ�")).click();
			
			List<WebElement> checkboxs = wd.findElements(By.name("allowUpload")) ;
			for(WebElement checkbox:checkboxs){
				if(checkbox.isSelected()){
					checkbox.click();			}
			}
			wd.findElement(By.id("allowedFiles")).clear();
			wd.findElement(By.id("submit")).click();
			Thread.sleep(3000);
			
		}

}
