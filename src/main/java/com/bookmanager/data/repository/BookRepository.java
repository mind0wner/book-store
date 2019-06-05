package com.bookmanager.data.repository;

import com.bookmanager.data.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);

    List<Book> findByTitleContainsIgnoreCase(String title);
}