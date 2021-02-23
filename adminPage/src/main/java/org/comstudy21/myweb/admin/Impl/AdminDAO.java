package org.comstudy21.myweb.admin.Impl;

import org.comstudy21.myweb.admin.AdminVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("adminDAO")
public class AdminDAO {
	@Autowired
	SqlSessionTemplate mybatis;
	
	
	public AdminVO getAdminLoginChk(AdminVO vo) {
	
		return mybatis.selectOne("",vo);
	}

	public AdminVO getAdmin(AdminVO vo) {
		
		return mybatis.selectOne("",vo);
	}

}
