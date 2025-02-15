package com.example.library;

import book.BookLibrary;

public class LibraryInitializer {
    // Метод ініціалізації бібліотеки з початковими книгами
    public static void initialize(BookLibrary library) {
        // Додавання книг Георга Орвелла
        library.addBook("1984", "George Orwell");
        library.addBook("Animal Farm", "George Orwell");
        library.addBook("Homage to Catalonia", "George Orwell");

        // Додавання книг Дж.Д. Селінджера
        library.addBook("The Catcher in the Rye", "J.D. Salinger");
        library.addBook("Franny and Zooey", "J.D. Salinger");
        library.addBook("Nine Stories", "J.D. Salinger");

        // Додавання книг Харпер Лі
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("Go Set a Watchman", "Harper Lee");
        library.addBook("Mockingbird: A Portrait of Harper Lee", "Charles J. Shields");

        // Додавання книг Германа Мелвілла
        library.addBook("Moby-Dick", "Herman Melville");
        library.addBook("Billy Budd", "Herman Melville");
        library.addBook("The Confidence-Man", "Herman Melville");

        // Додавання книг Джейн Остін
        library.addBook("Pride and Prejudice", "Jane Austen");
        library.addBook("Sense and Sensibility", "Jane Austen");
        library.addBook("Emma", "Jane Austen");

        // Додавання книг Ф. Скотта Фіцджеральда
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("Tender Is the Night", "F. Scott Fitzgerald");
        library.addBook("This Side of Paradise", "F. Scott Fitzgerald");

        // Додавання книг Олдоса Хакслі
        library.addBook("Brave New World", "Aldous Huxley");
        library.addBook("Island", "Aldous Huxley");
        library.addBook("The Doors of Perception", "Aldous Huxley");

        // Додавання книг Дж. Р. Р. Толкіна
        library.addBook("The Hobbit", "J.R.R. Tolkien");
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook("The Silmarillion", "J.R.R. Tolkien");

        // Додавання книг Габріеля Гарсія Маркеса
        library.addBook("One Hundred Years of Solitude", "Gabriel García Márquez");
        library.addBook("Love in the Time of Cholera", "Gabriel García Márquez");
        library.addBook("Chronicle of a Death Foretold", "Gabriel García Márquez");

        // Додавання книг Федора Достоєвського
        library.addBook("Crime and Punishment", "Fyodor Dostoevsky");
        library.addBook("The Brothers Karamazov", "Fyodor Dostoevsky");
        library.addBook("Notes from Underground", "Fyodor Dostoevsky");
    }
}
