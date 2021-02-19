package org.comstudy21.myweb.model;

import java.io.Serializable;

public class BoardDto implements Serializable {
	private int seq;
	private String title;
	private String writer;
	private String cntent;
	private String regDate;
	private int cnt;
	
	public BoardDto() {
		this(0,"","","","",0);
	}

	public BoardDto(int seq, String title, String writer, String cntent, String regDate, int cnt) {
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.cntent = cntent;
		this.regDate = regDate;
		this.cnt = cnt;
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

	public String getCntent() {
		return cntent;
	}

	public void setCntent(String cntent) {
		this.cntent = cntent;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "BoardDto [seq=" + seq + ", title=" + title + ", writer=" + writer + ", cntent=" + cntent + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}
}
