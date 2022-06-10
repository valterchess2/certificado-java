package com.magna.practicetests.teste3;

public class Whiz30 {
    public static void main(String[] args) {
        double d = new Divider().divide(30, 3);
        System.out.println(d);
    }
}
class Divider{
    double divide(int i, int j){
        return i/j;
    }
}
