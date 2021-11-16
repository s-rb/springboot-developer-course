package ru.list.surkovr.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//		SpringApplication.run(Demo2Application.class, args);
        ConfigurableApplicationContext context = new SpringApplicationBuilder(DemoApplication.class)
                .banner(new MyBanner())
                .run(args);
        SomethingLockedCheckerService service = context.getBean(SomethingLockedCheckerService.class);
        service.printIsLocked();
    }

}
