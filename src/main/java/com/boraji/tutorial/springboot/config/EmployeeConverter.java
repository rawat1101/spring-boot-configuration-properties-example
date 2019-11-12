package com.boraji.tutorial.springboot.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class EmployeeConverter implements Converter<String, Employee> {

	@Override
	public Employee convert(String from) {
		String[] data = from.split(",");
		return new Employee(Integer.parseInt(data[0]), data[1]);
	}
}