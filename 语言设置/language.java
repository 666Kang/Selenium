package chanzhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class language extends chanbase{
	//��������
	@Test
	public void language() throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("վ��")).click();
		wd.findElement(By.linkText("��������")).click();
		
		List<WebElement> checkboxs = wd.findElements(By.name("enabledLangs[]"));   //�൱�ڰ�һ���б��ֵ����checkboxs��
		for(WebElement checkbox:checkboxs){  //webelement���͵�CheckBoxֵ��forѭ������checkboxs����Ķ���
		if(checkbox.isSelected()){           //�ж�checkbox�ǲ��Ǳ�ѡ�У�����ǣ��͵��һ��ȡ��ѡ��
			checkbox.click();
			}
//			checkbox.click();
//			checkbox.sendKeys(Keys.BACK_SPACE);
//			checkbox.sendKeys(Keys.BACK_SPACE);
		}
		
		wd.findElement(By.id("enabledLangs1")).click();
		wd.findElement(By.id("enabledLangs2")).click();
		wd.findElement(By.id("cn2tw1")).click();
		wd.findElement(By.id("defaultLang1")).click();
		wd.findElement(By.id("submit")).click();   //�������
		Thread.sleep(3000);
		
	}
}
