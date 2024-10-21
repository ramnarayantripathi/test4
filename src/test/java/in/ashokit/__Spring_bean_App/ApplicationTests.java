package in.ashokit.__Spring_bean_App;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class ApplicationTests {
	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-beans.xml");

	 Motor motor1 = context.getBean("motor", Motor.class);
	 System.out.println(motor1.hashCode());

	 Motor motor2 = context.getBean("motor", Motor.class);
	 System.out.println(motor2.hashCode());
	}

}
