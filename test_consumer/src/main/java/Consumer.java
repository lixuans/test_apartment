
import com.ly.bean.Response;
import com.ly.bean.User;
import com.ly.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		UserService userService = (UserService)context.getBean("userService1"); // 获取远程服务代理
		Response response = userService.getUserOne("lixuan"); // 执行远程方法

		if(response.isSuccess()){
			User user=(User)response.getData();
		}else{
			System.out.println(response.getErrorCode()); // 显示调用结果
			System.out.println(response.getErrorMsg()); // 显示调用结果
		}
	}

}
