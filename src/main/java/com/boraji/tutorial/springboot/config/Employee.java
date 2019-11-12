package com.boraji.tutorial.springboot.config;

public class Employee {
	private int contry_code;
	private String contry_name;

	public int getContry_code() {
		return contry_code;
	}

	public void setContry_code(int contry_code) {
		this.contry_code = contry_code;
	}

	public String getContry_name() {
		return contry_name;
	}

	public void setContry_name(String contry_name) {
		this.contry_name = contry_name;
	}

	public Employee(int contry_code, String contry_name) {
		super();
		this.contry_code = contry_code;
		this.contry_name = contry_name;
	}

}
