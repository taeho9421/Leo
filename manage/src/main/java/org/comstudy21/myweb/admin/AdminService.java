package org.comstudy21.myweb.admin;

public interface AdminService {
	// CRUD 
	// 회원 등록
	public AdminVO getAdmin(AdminVO vo);
	
	public AdminVO getAdminLoginChk(AdminVO vo);
}
