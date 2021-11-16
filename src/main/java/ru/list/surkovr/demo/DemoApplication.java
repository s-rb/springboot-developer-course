package ru.list.surkovr.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Demo2Application.class, args);
		new SpringApplicationBuilder(DemoApplication.class)
				.banner(new MyBanner())
				.run(args);
	}

}
