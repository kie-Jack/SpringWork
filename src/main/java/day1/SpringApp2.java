package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp2 {
	public static void main(String[] args) {
		//스프링 컨테이너가 bean을 생성합니다.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext2.xml");
		
		MemberController controller = (MemberController)context.getBean("memberController");
		System.out.println(controller.findMember(23));
		
	}
}
