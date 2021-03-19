package org.comstudy21.myapp.admin;

import javax.servlet.http.HttpSession;

import org.comstudy21.myapp.member.MemberDTO;

public interface AdminService {
	// 관리자 로그인 체크
	boolean loginCheck(AdminDTO dto, HttpSession session) throws Exception;
	// 회원 강제 ㅅ가제 
	void admin_member_delete(MemberDTO dto) throws Exception;
	
	
}
