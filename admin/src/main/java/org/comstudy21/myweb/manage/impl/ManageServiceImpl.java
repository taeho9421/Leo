package org.comstudy21.myweb.manage.impl;

import java.util.List;

import org.comstudy21.myweb.manage.ManageService;
import org.comstudy21.myweb.manage.ManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("manageService")
public class ManageServiceImpl implements ManageService {
	@Autowired
	private org.comstudy21.myweb.manage.ManageService manageDAO;

	public void insertUser(ManageVO vo) {
		manageDAO.insertUser(vo);
	}

	public void updateUser(ManageVO vo) {
		manageDAO.updateUser(vo);
	}

	public void deleteUser(ManageVO vo) {
		manageDAO.deleteUser(vo);
	}

	public ManageVO getUser(ManageVO vo) {
		return manageDAO.getUser(vo);
	}

	public List<ManageVO> getUserList(ManageVO vo) {
		return manageDAO.getUserList(vo);
	}
}
