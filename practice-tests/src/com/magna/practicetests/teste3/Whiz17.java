package com.magna.practicetests.teste3;

public class Whiz17 {
    public static void main(String[] args) {
        new Whiz17().iterator(new int[]{10,12,13});
    }

     void iterator(int[] ints) {
        for (int x = 0; x < ints.length; System.out.print(ints[x] +""))x++;
    }
}
