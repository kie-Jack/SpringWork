package jcpdev.day1.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jcpdev.dto.Member;

@Component("memberJdbc")	//bean의 이름을 기본이름에서 변경하기
public class MemberJDBCImpl implements MemberDao{


	public MemberJDBCImpl(@Value("제이디비씨") String message) {    //기본 생성자 없이 @Value("test")  사용 가능함.
		//bean이 생성되는 순서를 확인하기 위해 작성한 출력문
		System.out.println("MemberJDBCImpl create.///////////////////");
		System.out.println(message);
	}

	public Member findMember(int idx) {
		System.out.println("MemberJDBCImpl findMember()///////////////////");
		return new Member(idx,"momo@GMAIL.com", "1212");
	}
}