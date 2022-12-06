package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean1;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		
		//t1객체를 가져옴 (lazy-init, init-method)
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		System.out.printf("t0: %s\n", t1);


		ctx.close();



	}
	
	

}
