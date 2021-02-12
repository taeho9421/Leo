package com.comstudy21.myapp.admin.impl;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comstudy21.myapp.admin.AdminService;
import com.comstudy21.myapp.admin.AdminVO;

@Repository("adminDAO")
public class AdminDAO implements AdminService {
	@Autowired
	SqlSessionTemplate mybatis;
	
	@Override
	public AdminVO getAdminLoginChk(AdminVO vo) {
		return mybatis.selectOne("mappers.admin-Mapper.getAdminLoginChk", vo);
	}


}
