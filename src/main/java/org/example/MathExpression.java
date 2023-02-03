package org.example;

import java.util.ArrayList;
import java.util.List;

public class MathExpression {
    public static double calculateExpression(String[] arrVariable) {
        List<String> listOperand = new ArrayList<>();
        List<String> listOperators = new ArrayList<>();
        for (int i = 0; i < arrVariable.length; i++) {
            if (!arrVariable[i].equals("+") && !arrVariable[i].equals("-") && !arrVariable[i].equals("*") && !arrVariable[i].equals("/")) {
                listOperand.add(arrVariable[i]);
            }
        }
        for (int i = 0; i < arrVariable.length; i++) {
            if (arrVariable[i].equals("+") || arrVariable[i].equals("-") || arrVariable[i].equals("*") || arrVariable[i].equals("/")) {
                listOperators.add(arrVariable[i]);
            }
        }
        List<String> reverseListOperators = new ArrayList<>();
        for (int i = listOperators.size() - 1; i >= 0; i--) {
            reverseListOperators.add(listOperators.get(i));
        }
        Double result = 0.0;
        for (int i = listOperand.size() - 1; i > 0; ) {
            result = Double.parseDouble(listOperand.get(i));
            for (int j = 0; j < reverseListOperators.size(); j++) {
                if (reverseListOperators.get(j).equals("+")) {
                    result = Double.parseDouble(listOperand.get(i - 1)) + result;
                } else if (reverseListOperators.get(j).equals("-")) {
                    result = Double.parseDouble(listOperand.get(i - 1)) - result;
                } else if (reverseListOperators.get(j).equals("*")) {
                    result = Double.parseDouble(listOperand.get(i - 1)) * result;
                } else if (reverseListOperators.get(j).equals("/")) {
                    result = Double.parseDouble(listOperand.get(i - 1)) / result;
                }
                i--;
            }
        }
        return result;
    }
}








