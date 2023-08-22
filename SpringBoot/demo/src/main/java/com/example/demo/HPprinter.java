package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HPprinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("HP印表機："+message);
    }
}
