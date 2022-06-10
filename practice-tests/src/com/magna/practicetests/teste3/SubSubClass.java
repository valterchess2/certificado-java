package com.magna.practicetests.teste3;

class MainClass{
    MainClass(){
        System.out.print("MainClass");
    }
}
class SubClass extends MainClass{
    {System.out.print("i");}
    static {System.out.print("S ");}
    SubClass(int i){
        this();
        System.out.print("SubClass");
    }
    SubClass(){
        super();
        System.out.print("SubClass");
    }
}
public class SubSubClass extends SubClass{

    SubSubClass(String s){
        super();
        System.out.print("SubSubClass");
    }

    public static void main(String[] args) {
        new SubSubClass("ABC");
    }
}
