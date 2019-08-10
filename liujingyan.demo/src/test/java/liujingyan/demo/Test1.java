package liujingyan.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liujingyan.utils.CommonUtil;

public class Test1 {
	
	@Test
	public void add(){
		int placeHolder = CommonUtil.getPlaceHolder("qweqwsafla798465", "[^0-9]");
		System.out.println(placeHolder);
		
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
