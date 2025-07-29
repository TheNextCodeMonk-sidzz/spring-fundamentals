package com.sidbhujbal.springdemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {
	
	public static void main(String[] args) {
//		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("Welcome please use a size of table ");
		Scanner sc=new Scanner(System.in);
		String size=sc.nextLine();
//		Table short_table=new short_table();
//		Table long_table=new long_table();
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Table long_table=(Table)context.getBean("long_table");
		Table short_table=(Table)context.getBean("short_table");
		
		if(size.equals("short")) {
			System.out.println(short_table.size_of_table());
			
		}else {
			System.out.println(long_table.size_of_table());
		}
		
	}


}
