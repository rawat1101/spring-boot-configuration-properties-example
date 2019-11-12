package com.boraji.tutorial.springboot;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.boraji.tutorial.springboot.config.Employee;

@ConfigurationProperties(prefix = "myapp.mail")
public class Response {
	private List<Employee> contry_list;

	public List<Employee> getContry_list() {
		return contry_list;
	}

	public void setContry_list(List<Employee> contry_list) {
		this.contry_list = contry_list;
	}

}