package com.book.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.book.management")
public class BookManagementApplication {
	
	/*
	 * @RequestMapping("/") public String hi() { return
	 * "<h1>Hi Pavan......................................</h1>"; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}

}
