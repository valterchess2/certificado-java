package com.magna.practicetests.teste3;

public class Whiz38 {
    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<String>(10);
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("D");
        list.add(1,"B");
        list.set(4,"F");
        System.out.println(list);
    }
}
