package com.example.interview.dto;

public class BookDto {

    private final String title;
    private final String isbn;

    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
}
