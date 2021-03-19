package org.comstudy21.myapp.admin;

public class AdminDTO {
	private String admin_id; // 관리자 아이디
	private String admin_pass; // 관리자 비밀번호
	private String admin_phone; // 관리자 핸드폰 번호
	private String admin_email; // 관리자 이메일
	private String level; // 관리자 등급 
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "AdminDTO [admin_id=" + admin_id + ", admin_pass=" + admin_pass + ", admin_phone=" + admin_phone
				+ ", admin_email=" + admin_email + ", level=" + level + "]";
	}
	
	
}
