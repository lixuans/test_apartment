import com.ly.bean.User;
import com.ly.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ioc.start();
		System.in.read();
	}

}
