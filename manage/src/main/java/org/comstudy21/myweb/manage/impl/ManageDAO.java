package org.comstudy21.myweb.manage.impl;

import java.util.List;

import org.comstudy21.myweb.manage.ManageService;
import org.comstudy21.myweb.manage.ManageVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageDAO")
public class ManageDAO implements ManageService {
	@Autowired
	SqlSessionTemplate mybatis;

	@Override
	public void insertUser(ManageVO vo) {
		mybatis.insert("org.comstudy21.myweb.ManageMapper.insertUser", vo);
	}

	@Override
	public void updateUser(ManageVO vo) {
		mybatis.insert("org.comstudy21.myweb.ManageMapper.updateUser", vo);
	}

	@Override
	public void deleteUser(ManageVO vo) {
		mybatis.insert("org.comstudy21.myweb.ManageMapper.deleteUser", vo);
	}

	@Override
	public ManageVO getUser(ManageVO vo) {
		return mybatis.selectOne("org.comstudy21.myweb.ManageMapper.getUser", vo);
	}

	@Override
	public List<ManageVO> getUserList(ManageVO vo) {
		return mybatis.selectList("org.comstudy21.myweb.ManageMapper.getUserList", vo);
	}
	
}