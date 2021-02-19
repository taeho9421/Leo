package org.comstudy21.myweb.app.collections;

import java.util.List;

import org.comstudy21.myweb.collections.ListBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		// applicationContext.xml에 생성한  listBean을 사용하기
		GenericXmlApplicationContext ctx =
		new GenericXmlApplicationContext("applicationContext.xml");
		
		ListBean listBean = (ListBean) ctx.getBean("listBean");
		List<String> addrList = listBean.getAddrList();
		for(String addr : addrList) {
			System.out.println(addr);
		}
	}
}
