package com.bookmanager.business.service;

import com.bookmanager.data.entities.Book;
import com.bookmanager.data.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean addBook(Book book) {
        Book dbBook = bookRepository.findByTitle(book.getTitle());
        if (dbBook != null) {
            return false;
        }
        bookRepository.save(book);
        return true;
    }

    public void editBook(Book book, String title, String author, double price) {
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> filterBooks(String title) {
        if (title != null && !title.isEmpty()) {
            return bookRepository.findByTitleContainsIgnoreCase(title);
        } else {
            return bookRepository.findAll();
        }
    }

}