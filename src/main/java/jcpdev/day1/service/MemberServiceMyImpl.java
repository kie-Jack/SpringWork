package jcpdev.day1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jcpdev.day1.dao.MemberDao;
import jcpdev.dto.Member;

@Component
public class MemberServiceMyImpl implements MemberService {
	
	private final MemberDao dao;
	
	//의존성 주입을 생성자로 합니다.
	@Autowired
	public MemberServiceMyImpl(@Qualifier(value="memberDao")MemberDao dao) {
		System.out.println("MemberServiceMyImpl create.///////////////////");
		this.dao = dao;
	}

	public Member findMember(int idx) {
		
		System.out.println("MemberServiceMyImpl findMember()///////////////////");
		return dao.findMember(idx);
	}

}
