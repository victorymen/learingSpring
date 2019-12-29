package com.huawei.springBoot;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Book {
    private String name;
    private int price;

    public Book(String spring, int i) {
        this.name = spring;
        this.price = i;
    }
}
