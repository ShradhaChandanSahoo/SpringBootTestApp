package com.nareshit.lombok.runner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("WELCOME TO SPRING BOOT APP");
		System.out.println("HELLO MODIFIED");
	}

}
