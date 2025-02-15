package com.example.library;

import book.Book;
import book.BookLibrary;

import java.util.List;
import java.util.Scanner;

// Головний клас програми для взаємодії з користувачем
public class LibraryApp {
    public static void main(String[] args) {
        // Створюємо екземпляр бібліотеки та ініціалізуємо її за допомогою LibraryInitializer
        BookLibrary library = new BookLibrary();
        LibraryInitializer.initialize(library);

        // Створюємо об'єкт для зчитування вводу користувача
        Scanner scanner = new Scanner(System.in);

        // Безкінечний цикл для взаємодії з користувачем
        while (true) {
            // Виводимо меню вибору дій
            System.out.println("\n1. Додати книгу\n2. Пошук за назвою\n3. Пошук за автором\n4. Відобразити всі книги\n5. Вийти");

            // Зчитуємо вибір користувача
            int choice = scanner.nextInt();
            scanner.nextLine();  // Очищаємо буфер вводу після числа

            // Обробляємо вибір користувача за допомогою switch
            switch (choice) {
                case 1:
                    // Дія для додавання книги
                    System.out.print("Введіть автора: ");
                    String author = scanner.nextLine();  // Зчитуємо автора книги
                    System.out.print("Введіть назву книги: ");
                    String title = scanner.nextLine();   // Зчитуємо назву книги
                    library.addBook(title, author);  // Додаємо книгу до бібліотеки
                    break;
                case 2:
                    // Дія для пошуку книги за назвою
                    System.out.print("Введіть назву книги для пошуку: ");
                    List<Book> foundBooksByTitle = library.searchByTitle(scanner.nextLine());  // Пошук книг за назвою
                    if (foundBooksByTitle.isEmpty()) {
                        System.out.println("Книги не знайдено.");  // Якщо книги не знайдено
                    } else {
                        foundBooksByTitle.forEach(System.out::println);  // Виводимо знайдені книги
                    }
                    break;
                case 3:
                    // Дія для пошуку книги за автором
                    System.out.print("Введіть автора для пошуку: ");
                    List<Book> foundBooksByAuthor = library.searchByAuthor(scanner.nextLine());  // Пошук книг за автором
                    if (foundBooksByAuthor.isEmpty()) {
                        System.out.println("Книги не знайдено.");  // Якщо книги не знайдено
                    } else {
                        foundBooksByAuthor.forEach(System.out::println);  // Виводимо знайдені книги
                    }
                    break;
                case 4:
                    // Дія для відображення всіх книг бібліотеки
                    library.displayBooks();
                    break;
                case 5:
                    // Вихід з програми
                    return;
                default:
                    // Якщо користувач ввів некоректний вибір
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
