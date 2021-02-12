package com.comstudy21.myapp.admin.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comstudy21.myapp.admin.AdminService;
import com.comstudy21.myapp.admin.AdminVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public AdminVO getAdminLoginChk(AdminVO vo) throws Exception {
		
		return adminDAO.getAdminLoginChk(vo);
	}
	
	
}
