package com.example;

import org.junit.Test;

import com.example.domain.IntegerEntity;

public class DemoApplicationTests {

	@Test
	public void callGenericMethod() {
		DemoApplication application = new DemoApplication();

		IntegerEntity entity = new IntegerEntity(1);
		application.test(entity);
	}

	@Test
	public void callGenericStaticMethod() {
		IntegerEntity entity = new IntegerEntity(2);
		DemoApplication.testStatic(entity);
	}
}
