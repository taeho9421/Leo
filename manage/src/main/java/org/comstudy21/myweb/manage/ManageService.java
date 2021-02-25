package org.comstudy21.myweb.manage;

import java.util.List;

public interface ManageService {

	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertUser(ManageVO vo);

	// 글 수정
	void updateUser(ManageVO vo);

	// 글 삭제
	void deleteUser(ManageVO vo);

	// 글 상세 조회
	ManageVO getUser(ManageVO vo);

	// 글 목록 조회
	List<ManageVO> getUserList(ManageVO vo);

}