package chanzhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registration1_1_s extends chanbase{
	//ע��Э�顪��������������Ϸ������ݺϷ�
	
	//��������
	@DataProvider(name="world")
	public static Object[][] worlds(){
		return new Object[][]{{"����ע��Э��","�Ϸ�������"}};
	}
	
	@Test(dataProvider="world")
	public void registration(String a,String b) throws InterruptedException{
		wd.get("http://10.7.90.246:8032/chanzhieps/www/admin.php");
		Thread.sleep(3000);
		wd.findElement(By.name("account")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("����")).click();
		wd.findElement(By.linkText("ע��Э��")).click();
		
		wd.findElement(By.id("agreement1")).click();
		wd.findElement(By.id("agreementTitle")).clear();
		wd.findElement(By.id("agreementTitle")).sendKeys(a);
		//iframe�ı���
		Actions action = new Actions(wd);
		action.sendKeys(Keys.TAB);
//		action.clear().perform();
		action.sendKeys(b).perform();
		
		wd.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
}
