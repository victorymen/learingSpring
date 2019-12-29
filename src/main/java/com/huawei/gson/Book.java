package com.huawei.gson;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Book {
    private String name;
    private int price;
    private Date date;

    public Book(String spring, int i, Date date) {
        this.name = spring;
        this.price = i;
        this.date = date;
    }
}
