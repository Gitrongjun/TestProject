package CAutotest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterables;

public class TestHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dri = new ChromeDriver();
		String bandle0 = dri.getWindowHandle();
		dri.get("http://wwww.baidu.com");
		String bandle = dri.getWindowHandle();
		dri.findElement(By.cssSelector("area[href='//www.baidu.com/s?wd=%E4%BB%8A%E6%97%A5%E6%96%B0%E9%B2%9C%E4%BA%8B&tn=SE_PclogoS_8whnvm25&sa=ire_dl_gh_logo&rsv_dl=igh_logo_pcs']")).click();
		
		dri.findElement(By.cssSelector("area[href='//www.baidu.com/s?wd=%E4%BB%8A%E6%97%A5%E6%96%B0%E9%B2%9C%E4%BA%8B&tn=SE_PclogoS_8whnvm25&sa=ire_dl_gh_logo&rsv_dl=igh_logo_pcs']")).click();
		System.out.println(bandle);
		Set<String> bandle1 = dri.getWindowHandles();
		//List<String> it = new ArrayList<String>(bandle1);
		List<String> it =new ArrayList<String>(bandle1);
	
		System.out.println(it.get(0));
		dri.switchTo().window(it.get(0));
		dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dri.findElement(By.cssSelector("a[href='http://news.baidu.com']")).click();
		String bandle2 =dri.getWindowHandle();
		System.out.println(bandle2+"----");
		System.out.println(it.get(0)+"it.get(0)");
		System.out.println(it.get(1)+"it.get(1)");
		System.out.println(it.get(2)+"it.get(2)");
		/*	
		 * System.out.println(bandle0);
			System.out.println(bandle);
		 * Iterator<String> ite = bandle1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}*/
		
		
	}

}
