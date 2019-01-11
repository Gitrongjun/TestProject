package CTestNG;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class C_2_baidu_Test {
	WebDriver dri =null;
	//String url ="http://www.baidu.com";
	String SearchStr =null;
	String expected=null;
	
	@DataProvider(name = "testDate")//定义一个数据提供注释数组
	public static Object[][] primeNubers(){
		return new Object[][]{
			{"新梦想软件测试","新梦想软件测试_百度搜索"},
			{"12306","12306_百度搜索"},
			{"hao123","hao123_百度搜索"}
		};
	}	
	@BeforeMethod//每次在函数调用前执行注解
	@Parameters("url")//通过xml提供数据
	public void init(String url){
		dri = new ChromeDriver();
		C_2_baidu.OpenBrowse(dri, url);
	}
	@Test(dataProvider="testDate")//通过数组使用注解提供数据
	//@Parameters({"test1","test2","test3"})
	public void test1(String SearchStr,String expected){
		//SearchStr = "新梦想";
		//expected= SearchStr+"_百度搜索";
		C_2_baidu.Search(dri, SearchStr);
		
		assertEquals(dri.getTitle(),expected);
	}
	@AfterMethod
	public void Destructor(/*WebDriver dri*/){
		C_2_baidu.quit(dri);
	}
}

