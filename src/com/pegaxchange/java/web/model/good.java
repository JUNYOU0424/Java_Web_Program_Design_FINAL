package com.pegaxchange.java.web.model;
public class good {
	private int good_id;
	private int good_price;
	private int good_nums;
	private String good_type;
	private String good_department;
	private String good_name;
	
	public good() {}
	
	public good(int id,int price,int nums,String type,String department,String name) {
		this.good_id=id;
		this.good_price=price;
		this.good_nums=nums;
		this.good_department=department;
		this.good_type=type;
		this.good_name=name;
	}
	
	public int getid() {
		return good_id;
	}
	public void setid(int id) {
		this.good_id=id;
	}
	public int getprice() {
		return good_price;
	}
	public void setprice(int price) {
		this.good_price=price;
	}
	public int getnums() {
		return good_nums;
	}
	public void setnums(int nums) {
		this.good_nums=nums;
	}
	public String getname() {
		return good_name;
	}
	public void setname(String name) {
		this.good_name=name;
	}
	public String gettype() {
		return good_type;
	}
	public void settype(String type) {
		this.good_type=type;
	}
	public String getdepartment() {
		return good_department;
	}
	public void setdepartment(String department) {
		this.good_department=department;
	}
	
	
	public String toString() {
		return "name:"+good_name+","+"id:"+good_id+","+"nums:"+good_nums+","+"price:"+
	           good_price+","+"type:"+good_type+","+"department:"+good_department;
	}
}


