package org.comstudy21.myweb.collections;

import java.util.Map;

import org.comstudy21.myweb.app.MyMessage;

public class MapBean {
	private Map<String, MyMessage> msgMap;
	
	// property > map > entry > key, value
	public void setMsgMap(Map<String, MyMessage> msgMap) {
		this.msgMap = msgMap;
	}
	
	public Map<String, MyMessage> getMsgMap() {
		return this.msgMap;
	}
}
