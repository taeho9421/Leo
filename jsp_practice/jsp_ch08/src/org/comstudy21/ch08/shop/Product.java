package org.comstudy21.ch08.shop;

public class Product {
	int pno;
	String pname;
	int price;
	int ea;
	public Product() {
		this(0,"",0,0);
	}
	public Product(int pno, String pname, int price, int ea) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.ea = ea;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", ea=" + ea + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product p = (Product)obj;
			if(p.pno == pno) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return pname.hashCode()+pno;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Product(pno, pname, price, ea);
	}
}


