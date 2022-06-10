package com.magna.practicetests.teste3;

public class Whiz26 {
    int i = 10;

    public static void main(String[] args) {
        int i;
        if(new Whiz26().go(10)) i = 5;
//            System.out.println(i);
    }
    boolean go(int y){
        if (y>5) return true;
        return false;
    }
}
