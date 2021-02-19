package test.web;

import java.io.Serializable;

public class MemberBean implements Serializable {
	// 고유번호는 없어도 된다.
	private static final long serialVersionUID = 4404293530412258894L;
	
	private String name;
	private String age;
	private String weight;
	private String height;
	private String sex;
	
	public MemberBean() { }
	
	public MemberBean(String name, String age, String weight, String height, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
