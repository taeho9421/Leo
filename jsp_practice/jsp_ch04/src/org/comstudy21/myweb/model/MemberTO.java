package org.comstudy21.myweb.model;

import java.io.Serializable;

public class MemberTO implements Serializable {
	private String name = "";
	private String height = "";
	private String weight = "";
	private int age = 0;
	private String gender = "";

	public MemberTO() {
	}

	public MemberTO(String name, String height, String weight, int age, String gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "memberTO [name=" + name + ", height=" + height + ", weight=" + weight + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
