package jcpdev.day1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jcpdev.day1.service.BoardService;

@Component					//-> bean으로 생성
public class BoardController {  //웹애플리케이션에서 클라이언트 요청 처리
	@Autowired			//BoardService 타입의 Bean을 주입한다.
	private BoardService service;		//의존관계 
	
	//기본생성자 동작
	public void setService(BoardService service) {	//의존관계 주입 방법1: setter(수정) 메소드
		this.service = service;
	}
	
	//의존관계 주입 방법2: 커스텀 생성자
	public void dataRead() {
		System.out.println("controller dataRead()------");
		service.dataRead();
	}

}

/*@Autowired는 필드, 생성자, 메소드에서 의존관계를 주입할 수 있다. -> byType으로 주입한다.
			주입할 bean이 없으면 오류가 발생한다.
@Component로 bean을 생성할 때는 = 사용할 때는 기본생성자 -> 커스텀 생성자 순서로 생성.
-> 이 때 @Autowired를 만나면 해당 bean을 먼저 생성하여 주입한다.

@Qualifier(value="memberYourService")는
			@Autowired로 주입시킬 타입의 bean이 여러개일 때 bean의 이름을 지정한다.
			필드, 생성자, setter메소드 에 사용할 수 있다.
			
@Autowired(required = false) 는 주입할 bean이 없을 때 오류가 발생하지 않는다.


*결론 : 추천
대부분의 의존관계 주입은 한 번 일어나면 애플리케이션 종료시점까지 의존관계를 변경하지 않는다.
bean을 주입할 필드 변수는 final로 선언하고, 커스텀 생성자 주입을 사용한다.
*/