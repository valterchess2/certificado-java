package com.magna.practicetests.teste3;

public class Whiz37 {
    public static void main(String[] args) {
        String str = "IZO-808";
        str = str.replace("80", "81");
        str.length();
        str = str.substring(str.indexOf("80"), str.lastIndexOf("80"));
        System.out.print(str);
    }
}
