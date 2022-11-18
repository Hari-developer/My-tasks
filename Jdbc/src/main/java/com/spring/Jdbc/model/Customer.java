package com.spring.Jdbc.model;

public class Customer {

	private int custNo;
	private String custName;
	private int  age;

	public Customer() {
	}

	public Customer(int custNumber, String custName, int age) {
		this.custNo = custNumber;
		this.custName = custName;
		this.age = age;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}