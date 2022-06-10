package com.magna.practicetests.teste3;

import java.util.Arrays;

public class Whiz6 {
    public static void main(String[] args) {
        int[] ints = {3, 6, 1, 4, 0};

        Arrays.sort(ints, 0, 4);
        for (int num: ints){
            System.out.print(num);
        }
    }
}
