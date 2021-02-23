package org.comstudy21.myweb.admin.Impl;

import org.comstudy21.myweb.admin.AdminService;
import org.comstudy21.myweb.admin.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;
	
	public void setAdminDAO(AdminDAO vo) {
		this.adminDAO = adminDAO;
	}
	
	public AdminVO getAdmin(AdminVO vo) {
		return adminDAO.getAdmin(vo);
	}
	
	@Override
	public AdminVO getAdminLoginChk(AdminVO vo) {
		
		return adminDAO.getAdminLoginChk(vo);
	}

	
}
