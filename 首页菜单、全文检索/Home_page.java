package chanzhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home_page extends chanbase{
	//��ҳ�˵�
	@Test
	public void Home() throws InterruptedException{
		wd.get("http://10.7.88.70:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("վ��")).click();
		wd.findElement(By.linkText("��ҳ�˵�")).click();
		
		List<WebElement> checkboxs = wd.findElements(By.name("homeMenus[]"));   //�൱�ڰ�һ���б��ֵ����checkboxs��
		for(WebElement checkbox:checkboxs){  //webelement���͵�CheckBoxֵ��forѭ������checkboxs����Ķ���
		if(checkbox.isSelected()){           //�ж�checkbox�ǲ��Ǳ�ѡ�У�����ǣ��͵��һ��ȡ��ѡ��
			checkbox.click();
			}
		}
		wd.findElement(By.id("homeMenus1")).click();
		wd.findElement(By.id("homeMenus2")).click();
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
	}
}
