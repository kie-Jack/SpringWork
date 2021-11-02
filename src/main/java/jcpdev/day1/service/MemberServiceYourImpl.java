package jcpdev.day1.service;


import jcpdev.day1.dao.MemberDao;
import jcpdev.dto.Member;
//	@Component
public class MemberServiceYourImpl implements MemberService{
//	@Autowired
	public MemberServiceYourImpl() {;}
	private MemberDao dao;

	public MemberServiceYourImpl(MemberDao dao) {
		System.out.println("MemberServiceYourImpl create ///////////////////");
		this.dao = dao;
	}    
		
		public Member findMember(int idx) {
		System.out.println("MemberServiceYourImpl findMember() ///////////////////");
			return dao.findMember(idx*10);
		}	
}
