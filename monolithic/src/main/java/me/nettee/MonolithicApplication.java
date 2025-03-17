package me.nettee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.nettee")
public class MonolithicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonolithicApplication.class, args);
    }
}
