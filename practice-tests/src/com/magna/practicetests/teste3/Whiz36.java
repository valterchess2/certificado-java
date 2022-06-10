package com.magna.practicetests.teste3;

public class Whiz36 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aAaA");
        sb.insert(sb.lastIndexOf("A"), true);
        System.out.println(sb);

    }
}
