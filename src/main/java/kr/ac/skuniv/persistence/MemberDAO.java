package kr.ac.skuniv.persistence;

import kr.ac.skuniv.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);		
}
		