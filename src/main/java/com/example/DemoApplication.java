package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.domain.BaseEntity;

public class DemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public <T extends Number> void test(BaseEntity<T> entity) {
		logger.info("entity: {}", entity);
	}

	public static <T extends Number> void testStatic(BaseEntity<T> entity) {
		logger.info("static method, entity: {}", entity);
	}
}
