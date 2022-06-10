package com.magna.practicetests.teste3;

public class Whiz31 {
    int x  = 012;

    public static void main(String[] args) {
        Whiz31 pr = new Whiz31();
        pr.go(20);
    }

    void go(final int i) {
        System.out.println(i/x);
    }
}
