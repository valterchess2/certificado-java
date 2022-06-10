package com.magna.practicetests.teste3;

public class Whiz8 {
    public static void main(String[] args) {
        try{
            int i = Integer.parseInt(args[0]);
            System.out.print(i);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out ofo bounds exception");
        } catch (NumberFormatException e){
            System.out.println("Number format Exception");
        }
    }
}
