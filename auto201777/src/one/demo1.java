package one;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.webtest.core.BaseTest;

public class demo1 extends BaseTest{
//	@Test
//	public void testFronrLogin(){
//		webtest.open("http://localhost:8032/MyMovie");
//		webtest.click("link=��¼");
//		webtest.type("name=username","trk1");
//		webtest.type("name=password","123456");
//		webtest.click("xpath=//input[@value='���ϵ�¼']");
//		assertTrue(webtest.getHtmlSource().contains("�˳�"));
//	}
//	WebDriverEngine webtest=null;
//	
//	public demo1 (WebDriverEngine webtest){
//		this.webtest =webtest;
//	}
//	public void loginByFront(String userName,String passWord){
//		webtest.type("name=username", userName);
//		webtest.type("name=password", passWord);
//		webtest.click("type=submit");
//		
//		
//	}
	
	
	public class WebtestListener extends TestListenerAdapter{

		//Testָ����ÿһ����������
		public void onTestFailure(ITestResult result){
			//����
		}
		public void onTestSkipped(ITestResult result){
			
		}
		public void onTestSuccess(ITestResult result){
			//System.out.println("ִ�гɹ���");
			
		}
		public void onTestStart(ITestResult result){
			
		}
		//3.��������������testng.xml�е�,test��ǩ��ʼǰ����ִ��
		public void onStart(ITestContext content){
			
		}
		@Override
		public void onFinish(ITestContext content){
			System.out.println("����ִ����ϣ������ʼ�");
			
		}	
	}

}
