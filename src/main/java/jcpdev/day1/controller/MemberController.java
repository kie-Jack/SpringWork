package jcpdev.day1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jcpdev.day1.service.MemberService;
import jcpdev.dto.Member;
@Component
public class MemberController {
	@Autowired
	@Qualifier(value="memberServiceYourImpl")
	private MemberService service;

	public MemberController() {
		System.out.println("MemberController 기본생성자 created.=========");
	}
	
	//커스텀 생성자 동작 : MemberService service가 자동주입(@Autowired가 생략된 상태) - 기본 생성자 정의하는것으로 오류 수정
	public MemberController(MemberService service) {
		//생성자에서 의존관계 주입
		//인터페이스 타입인 이유 : 필요와 상황에 따라 구현체를 다르게 주입할 수 있다.
		System.out.println("MemberController create./////////");
		this.service = service;
	}   
    
	public Member findMember(int idx) {
		return service.findMember(idx);
	}
	
}
