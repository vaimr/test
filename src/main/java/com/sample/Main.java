package com.sample;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Hello (0 < args.length ? args[0] : null).getMessage());
    }
}
