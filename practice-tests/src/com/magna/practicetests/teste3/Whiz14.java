package com.magna.practicetests.teste3;

public class Whiz14 {
    static int i;
    int j;
    Whiz14(){
        j = i++;
    }
    public static void main(String[] args) {
        Whiz14 s = new Whiz14();
        Whiz14 s1 = new Whiz14();
        Whiz14 s2 = new Whiz14();
        System.out.print("i ="+s.i);
        System.out.print("j ="+s.j);
    }
}
