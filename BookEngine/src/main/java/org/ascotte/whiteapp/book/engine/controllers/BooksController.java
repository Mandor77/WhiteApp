package org.ascotte.whiteapp.book.engine.controllers;

import org.ascotte.whiteapp.book.engine.models.Book;
import org.ascotte.whiteapp.book.engine.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> list() {
        return bookRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable("id") long id) {
        return bookRepository.getOne(id);
    }

}
