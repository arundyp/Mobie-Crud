package com.arun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String company;
	private Integer price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Mobile(int id, String name, String company, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
	

}
