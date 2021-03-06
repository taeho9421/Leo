package com.myproject.myapp.board;

import java.util.Date;

public class BoardVO {
	// VO란 db를 구성하는 필드들을 접근할수있게 Getter, Setter 메소드의 조합으로 클래스가 형성되어진것 
	// 데이터에 접속하는 객체 / 데이터가 포함된 객체를 한 시스템에서 다른 시스템으로 전달하는 작업을 처리하는 개체 
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
	private String keyword;
	private String SearchCondition;
	
	public BoardVO() {
		this(0, "", "", "", null, 0, "");
	}
	
	public BoardVO(int seq) {
		this(seq,"","","",null,0,"");
	}
	public BoardVO(int seq, String title, String writer, String content, Date regDate, int cnt, String keyword) {
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.cnt = cnt;
		this.keyword = keyword;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regDate + ", cnt=" + cnt + ", keyword=" + keyword + ", SearchCondition=" + SearchCondition + "]";
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
