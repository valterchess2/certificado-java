package com.magna.practicetests.teste3;

class Person2{
    Person2(){
        System.out.print("CP ");
    }
    static {
        System.out.print("SP ");
    }
}
class Student extends Person2{
    Student(){
        System.out.print("CS ");
    }
}

class Teacher extends Person2{
    Teacher(){
        System.out.print("CT");
    }
    private Teacher(String s){
        System.out.print("OCT");
    }
}

public class Whiz32 {
    public static void main(String[] args) {
//        Person2 p1 = new Teacher("name");
//        Student
    }
}
