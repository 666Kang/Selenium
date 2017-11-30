package one;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.webtest.core.BaseTest;

public class demo1 extends BaseTest{
//	@Test
//	public void testFronrLogin(){
//		webtest.open("http://localhost:8032/MyMovie");
//		webtest.click("link=登录");
//		webtest.type("name=username","trk1");
//		webtest.type("name=password","123456");
//		webtest.click("xpath=//input[@value='马上登录']");
//		assertTrue(webtest.getHtmlSource().contains("退出"));
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

		//Test指的是每一个测试用例
		public void onTestFailure(ITestResult result){
			//截屏
		}
		public void onTestSkipped(ITestResult result){
			
		}
		public void onTestSuccess(ITestResult result){
			//System.out.println("执行成功了");
			
		}
		public void onTestStart(ITestResult result){
			
		}
		//3.以下两个方法在testng.xml中的,test标签开始前，后执行
		public void onStart(ITestContext content){
			
		}
		@Override
		public void onFinish(ITestContext content){
			System.out.println("用例执行完毕，发送邮件");
			
		}	
	}

}
