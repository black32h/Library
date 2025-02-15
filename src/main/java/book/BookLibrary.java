package com.example.library;

import java.util.ArrayList;
import java.util.List;

// Клас, що представляє бібліотеку книг
class BookLibrary {

    // Список для зберігання книг
    private List<Book> books = new ArrayList<>();

    // Метод для додавання книги в бібліотеку
    public void addBook(String title, String author) {
        books.add(new Book(title, author));  // Додаємо нову книгу до списку
    }

    // Метод для пошуку книг за назвою
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();

        // Проходимо по всіх книгах і перевіряємо, чи збігається назва
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);  // Якщо збігається, додаємо книгу до результату
            }
        }
        return result;  // Повертаємо список знайдених книг
    }

    // Метод для пошуку книг за автором
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        // Проходимо по всіх книгах і перевіряємо, чи збігається автор
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);  // Якщо збігається, додаємо книгу до результату
            }
        }
        return result;  // Повертаємо список знайдених книг
    }

    // Метод для виведення всіх книг бібліотеки
    public void displayBooks() {
        books.forEach(System.out::println);  // Для кожної книги виводимо її у консоль
    }

    // Геттер для отримання списку всіх книг
    public List<Book> getBooks() {
        return books;  // Повертаємо список книг
    }
}
