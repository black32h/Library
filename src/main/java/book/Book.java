package com.example.library;

import com.fasterxml.jackson.annotation.JsonProperty;

// Клас, що представляє книгу в бібліотеці
class Book {

    // Анотації для серіалізації та десеріалізації з JSON
    @JsonProperty
    private String title;  // Назва книги

    @JsonProperty
    private String author;  // Автор книги

    // Конструктор для ініціалізації книги з назвою та автором
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттер для отримання назви книги
    public String getTitle() {
        return title;
    }

    // Геттер для отримання автора книги
    public String getAuthor() {
        return author;
    }

    // Перевизначений метод toString для виведення назви та автора книги у зручному вигляді
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}
