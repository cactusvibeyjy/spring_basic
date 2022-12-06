package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		
		//id가 ㅇ벗으므로 클래스의 타입만 가지고 객체를 가져옴
		TestBean t0 = ctx.getBean("test0",TestBean.class);
		System.out.printf("t0: %s\n", t0);
		
		//id가 있을때,id로 가져옴
		TestBean t1 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t1: %s\n", t1);
		
		
		TestBean t2 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t2: %s\n", t2);
		
		// id가 test2인 bean 객체의 주소값을 받아온다.
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		//scope = prototype 가져올때마다 객체를 생성
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);




		// id가 test3인 bean 객체의 주소값을 받아온다.
		TestBean t5 = ctx.getBean("test3", TestBean.class);
				System.out.printf("t5 : %s\n", t5);
				
		TestBean t6 = ctx.getBean("test3", TestBean.class);
				System.out.printf("t6 : %s\n", t6);
		


		/*
		 * TestBean t2 = ctx.getBean("t1", TestBean.class);
		 * System.out.printf("t2: %s\n", t2);
		 */
		ctx.close();



	}
	
	

}
