package com.example.interview.controller;

import com.example.interview.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/create")
    public BookDto createBook(@RequestParam("title") String title, @RequestParam("isbn") String isbn) {
        // TODO to implement
    }

}
