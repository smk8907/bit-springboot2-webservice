package com.example.web.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing  활성화 =>  시간적용
@SpringBootApplication //서버역활하는 클래스임
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
