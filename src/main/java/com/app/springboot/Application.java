package com.app.springboot;

import com.app.springboot.model.Alien;
import com.app.springboot.model.Laptop;
import com.app.springboot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);


        LaptopService service = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);

    }
}
