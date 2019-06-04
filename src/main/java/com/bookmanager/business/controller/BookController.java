package com.bookmanager.business.controller;

import com.bookmanager.business.service.BookService;
import com.bookmanager.data.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String listBooks(Model model) {

        List<Book> books = bookService.findAll();

        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("{book}")
    public String bookEditForm(@PathVariable Book book, Model model) {
        model.addAttribute("book", book);
        return "bookEdit";
    }

    @RequestMapping("/remove/{id}")
    public String deleteBook(@PathVariable("id")int id){
        bookService.deleteById((long) id);
        return "redirect:/books";
    }

    @PostMapping
    public String editBook(
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam double price,
            @RequestParam("id") Book book
    ) {
        bookService.editBook(book, title, author, price);
        return "redirect:/books";
    }

    @GetMapping("/add")
    public String addBook() {
        return "addBook";
    }

    @PostMapping("/add")
    public String addBook(
            Book book, Model model
    ) {
        if (!bookService.addBook(book)) {
            model.addAttribute("msg", "Book already exists");
        }
        return "addBook";
    }

}