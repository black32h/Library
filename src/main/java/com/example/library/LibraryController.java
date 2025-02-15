package com.example.library;

import book.Book;
import book.BookLibrary;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Клас контролера для обробки HTTP-запитів
@RestController  // Анотація, яка вказує, що цей клас є контролером і відповідає на HTTP-запити
@RequestMapping("/library")  // Вказує базовий шлях для всіх методів контролера
public class LibraryController {
    // Створення об'єкта бібліотеки
    private final BookLibrary library = new BookLibrary();

    // Конструктор для ініціалізації бібліотеки з початковими даними
    public LibraryController() {
        LibraryInitializer.initialize(library);
    }

    // Метод для додавання книги до бібліотеки через HTTP POST запит
    @PostMapping("/add")  // Анотація для обробки POST-запиту за адресою "/library/add"
    public String addBook(@RequestParam String title, @RequestParam String author) {
        library.addBook(title, author);
        return "Книга додана: " + title;
    }

    // Метод для отримання всіх книг з бібліотеки через HTTP GET запит
    @GetMapping("/books")  // Анотація для обробки GET-запиту за адресою "/library/books"
    public List<Book> getAllBooks() {
        return library.getBooks();
    }

    // Метод для пошуку книг за назвою через HTTP GET запит
    @GetMapping("/search/title")  // Анотація для обробки GET-запиту за адресою "/library/search/title"
    public List<Book> searchByTitle(@RequestParam String title) {
        return library.searchByTitle(title);
    }

    // Метод для пошуку книг за автором через HTTP GET запит
    @GetMapping("/search/author")  // Анотація для обробки GET-запиту за адресою "/library/search/author"
    public List<Book> searchByAuthor(@RequestParam String author) {
        return library.searchByAuthor(author);
    }
}
