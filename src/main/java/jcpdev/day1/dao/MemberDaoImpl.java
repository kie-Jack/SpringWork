package jcpdev.day1.dao;

import org.springframework.stereotype.Component;

import jcpdev.dto.Member;

@Component("memberDao")
public class MemberDaoImpl implements MemberDao {
	
	public MemberDaoImpl() {
		System.out.println("MemberDaoImpl 기본생성자 created.=========");
	}		//@Autowired 하려면 기본 생성자 필요
	
	public MemberDaoImpl(String message) {	//기본 생성자 없이 @Value("test") 사용 가능함.
		//bean이 생성되는 순서를 확인하기 위해 작성한 출력문
		System.out.println("MemberDaoImpl create.//////////////////");
		System.out.println(message);
	}
	
	public Member findMember(int idx) {
		System.out.println("MemberDaoImpl findMember()///////////////////");
		return new Member(idx,"honey@naver.com", "1212");
	}
	
}
