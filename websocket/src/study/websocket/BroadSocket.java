package study.websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/broadSocket")
public class BroadSocket {
	static Set<Session> clientSessionSet = Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println("소켓 서버 "+ session.getId() +"이(가) 오픈 되었습니다...");
		clientSessionSet.add(session);
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("소켓 서버"+ session.getId() +"이(가) 닫혔습니다...");
		clientSessionSet.remove(session);
	}
	
	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("받은 메세지 : " + message);
		synchronized(clientSessionSet) {
			System.out.println("set size : " + clientSessionSet.size());
			for(Session clientSession : clientSessionSet) {
				if(!session.equals(clientSession)) {
					clientSession.getBasicRemote().sendText(session.getId() + " : " +message);
				}
			}
		}
	}
	
	@OnError 
	public void onError(Throwable th) {
		th.printStackTrace();
	}
}