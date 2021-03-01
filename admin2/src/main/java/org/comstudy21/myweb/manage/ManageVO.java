package org.comstudy21.myweb.manage;

import java.io.Serializable;


//VO(Value Object) - DTO와 차이점 Readonly의 성격을 가진다. 
public class ManageVO implements Serializable {
	private int seq;
	private String name;
	private String id;
	private String grade;
	
	private String keyword;
	private String searchCondition;
	
	public ManageVO() {
		this(0,"","","","");
	}
	
	public ManageVO(int seq) {
		this(seq,"","","","");
	}
	public ManageVO(int seq, String name, String id, String grade,String keyword) {
		this.seq = seq;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.keyword = keyword;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	@Override
	public String toString() {
		return "ManageVO [seq=" + seq + ", name=" + name + ", id=" + id + ", grade=" + grade + ", keyword=" + keyword
				+ "]";
	}

	
	
	
	
	
}