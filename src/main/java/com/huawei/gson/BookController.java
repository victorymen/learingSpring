package com.huawei.gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBook() {
        Book book = new Book("阿门先生", 108, new Date());
        return book;
    }
}
