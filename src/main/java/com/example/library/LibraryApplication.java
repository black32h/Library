package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Основний клас для запуску Spring Boot програми
@SpringBootApplication  // Анотація для позначення класу як точки входу в Spring Boot додаток
public class LibraryApplication {
    public static void main(String[] args) {
        // Запускаємо Spring Boot додаток
        SpringApplication.run(LibraryApplication.class, args);
    }
}
