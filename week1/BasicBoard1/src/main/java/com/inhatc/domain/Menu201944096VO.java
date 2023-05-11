package com.inhatc.domain;

public class Menu201944096VO {
	private int id;
	private String type;
	private String name;
	private int price;
	private int total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Menu201944096VO [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + ", total="
				+ total + "]";
	}
}
