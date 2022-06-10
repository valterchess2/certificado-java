package com.magna.practicetests.teste3;

public class Whiz7 {
    public static void main(String[] args) throws Exception{
        try{
            System.out.print("try started");
            throw new Exception();
        } catch (Exception ex){
            throw ex;
        } finally {
            System.out.print("Finally completed");
        }
    }
}
