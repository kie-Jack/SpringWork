package 

jcpdev.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jcpdev.day1.controller.BoardController;
import jcpdev.day1.controller.MemberController;


public class SpringApp3 {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext3.xml");
		
		//@Component의 bean 이름은 클래스이름이며 시작은 소문자입니다.
		
		BoardController controller = (BoardController)context.getBean("boardController");
		controller.dataRead();
			
		MemberController member = (MemberController)context.getBean("memberController");
		System.out.println(member.findMember(23));
		
		
		
		
		
		
		
	}
}