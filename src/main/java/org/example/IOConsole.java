package org.example;

import java.util.Scanner;

public class IOConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для вычисления:");
        String expression = scanner.nextLine();
        String[] arrString = Parsing.parseString(expression);
        while (!Validation.validExpression(arrString)){
            expression = scanner.nextLine();
            arrString = Parsing.parseString(expression);
        }
        System.out.println("Результат вычисления: " + MathExpression.calculateExpression(arrString));
    }
}