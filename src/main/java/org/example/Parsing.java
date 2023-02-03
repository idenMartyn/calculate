package org.example;

public class Parsing {
    public static String[] parseString(String expression){
       String[] arrString = expression.trim().split(" ");
       return arrString;
    }
}
