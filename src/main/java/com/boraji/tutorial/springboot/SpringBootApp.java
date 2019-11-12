package com.boraji.tutorial.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.boraji.tutorial.springboot.config.MailProperties;

import ch.qos.logback.classic.Level;

@SpringBootApplication
//@EnableConfigurationProperties(MailProperties.class)
public class SpringBootApp {

	public static void main(String[] args) {
		ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) org.slf4j.LoggerFactory
				.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
		root.setLevel(Level.OFF);
		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context = app.run(args);
		/*
		 * MailService mailService = context.getBean(MailService.class);
		 * mailService.print();
		 */
	}

}
