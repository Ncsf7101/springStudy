package com.rqiang;

import com.rqiang.service.BookService;
import com.rqiang.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
