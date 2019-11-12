package com.boraji.tutorial.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.boraji.tutorial.springboot.config.MailProperties;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private MailProperties mailProperties;

	@GetMapping("/get")
	public ResponseEntity<Object> get() {
		return new ResponseEntity<>(mailProperties.getResponse(), HttpStatus.OK);
	}
}
