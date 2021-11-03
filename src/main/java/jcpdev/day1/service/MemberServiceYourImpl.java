package jcpdev.day1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jcpdev.day1.dao.MemberDao;
import jcpdev.dto.Member;

@Component
public class MemberServiceYourImpl implements MemberService{
	private final MemberDao dao;
	
	//생성자 주입
	@Autowired
	public MemberServiceYourImpl(@Qualifier("memberJdbc")MemberDao dao) {
		System.out.println("MemberService유어Impl create ///////////////////");
		this.dao = dao;
	}    
		
		public Member findMember(int idx) {
		System.out.println("MemberService유어Impl findMember() ///////////////////");
			return dao.findMember(idx*10);
		}	
}
