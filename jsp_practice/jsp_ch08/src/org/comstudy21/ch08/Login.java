package org.comstudy21.ch08;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Login implements HttpSessionBindingListener {
	String userID;
	String passwd;
	static int total;
	
	public Login() {
		this("","");
	}
	public Login(String userID, String passwd) {
		this.userID = userID;
		this.passwd = passwd;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("valueBound ...");
		total++;
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("valueUnbound ...");
		total--;
	}

}
