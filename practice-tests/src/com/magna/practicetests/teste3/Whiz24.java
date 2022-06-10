package com.magna.practicetests.teste3;

class Animal{
    public  void eat()throws NullPointerException{
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal{
    void eat(String s) throws Exception{
        System.out.println("Dog eats" + s);
    }
}
public class Whiz24 {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        Dog d = (Dog) a;
//        a.eat();
//        d.eat("Meat");
    }
}
