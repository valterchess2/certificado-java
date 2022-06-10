package com.magna.practicetests.teste3;

public class Whiz22 {

    public static void main(String[] args) {
        int x = 0, y =10;

        if(x++ > 1 && ++y > 10)
            System.out.print(x + y);
        if (++y > 10 || ++x > 10)
            System.out.print(x+y);
    }
}
