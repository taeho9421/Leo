package org.comstudy21.model;

public class Dto {
	private int no;
	private String name;
	private int price;
	private int year;
	
	public Dto() {
		this(0,"",0,0);
	}

	public Dto(int no, String name, int price, int year) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.year = year;
	}

	
	
}
