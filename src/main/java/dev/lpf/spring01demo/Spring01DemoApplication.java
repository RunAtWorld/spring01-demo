package dev.lpf.spring01demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan({"dev.lpf"})
@MapperScan("dev.lpf..*")
public class Spring01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring01DemoApplication.class, args);
    }

}
