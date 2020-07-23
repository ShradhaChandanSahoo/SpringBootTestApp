package com.nareshit.lombok.runner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		int a=10;
		int b= 15;
		 System.out.println(a+b);
	}

}
