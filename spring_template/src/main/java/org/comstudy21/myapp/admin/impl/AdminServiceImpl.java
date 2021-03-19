package org.comstudy21.myapp.admin.impl;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.comstudy21.myapp.admin.AdminDTO;
import org.comstudy21.myapp.admin.AdminService;
import org.springframework.stereotype.Service;


public class AdminServiceImpl implements AdminService {
	
	@Inject
	AdminDAO admindao;
		
	@Override
	public boolean loginCheck(AdminDTO dto, HttpSession session) throws Exception {
		
		boolean result = admindao.loginCheck(dto);
		
		return result;
	}
	
}
