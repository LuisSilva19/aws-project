package com.luis.awsproject;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class awsProjectApplication {
	private static final Logger logger = LogManager.getLogger(awsProjectApplication.class);

	public static void main(String[] args) {
		log.info("project up");
		logger.info("tem que ir");
		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");

		logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
		SpringApplication.run(awsProjectApplication.class, args);
	}
}
