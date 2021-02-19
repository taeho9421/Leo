package org.comstudy21.myweb.user;

public interface UserService {
	// CRUD 
	// 회원 등록
	public UserVO getUser(UserVO vo);
	
	public UserVO getUserLoginChk(UserVO vo);
}
