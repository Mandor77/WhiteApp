package org.ascotte.whiteapp.book.engine.controllers;

import org.ascotte.whiteapp.book.engine.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    @GetMapping
    public List<Book> list() {
        List<Book> books = new ArrayList<>();
        return books;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBook(@RequestBody Book book) {

    }

    @GetMapping("/{id}")
    public Book get(@PathVariable("id") long id) {
        return new Book();
    }

}
