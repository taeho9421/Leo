package org.comstudy21.myweb.admin.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.comstudy21.myweb.admin.AdminService;
import org.comstudy21.myweb.admin.AdminVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// DAO(Data Access Object)
@Repository("adminDAO")
public class AdminDAO implements AdminService {
	@Autowired
	SqlSessionTemplate mybatis;

	@Override
	public AdminVO getAdmin(AdminVO vo) {
		return mybatis.selectOne("org.comstudy21.myweb.AdminMapper.getAdmin", vo);
	}
	
	public AdminVO getAdminLoginChk(AdminVO vo) {
		return mybatis.selectOne("org.comstudy21.myweb.AdminMapper.getAdminLoginChk", vo);
	}
	
}