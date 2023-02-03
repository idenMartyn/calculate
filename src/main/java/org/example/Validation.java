package org.example;

public class Validation {
    public static boolean validExpression(String[] arrString) {
        for (int i = 0; i < arrString.length; i++){
            if(arrString[i].matches("(-)?\\d+(\\.\\d+)?") && i == 0
               || arrString[i].matches("(-)?\\d+(\\.\\d+)?") && i % 2 == 0
               || arrString[i].matches("[+/*-]") && i % 2 != 0){
                continue;
            } else if (i == 0 && arrString[i].matches("\\D")) {
                System.out.println("Введите корректное выражение. На первом месте всегда должно стоять число");
                return false;
            } else if (i % 2 == 0  && arrString[i].matches("\\D")) {
                System.out.println("Введите корректное выражение. На чётных местах должны быть числа");
                return false;
            } else if (i % 2 != 0  && !arrString[i].matches("[+/*-]")) {
                System.out.println("Введите корректное выражение. На нечётных местах должны быть операторы +-/*");
                return false;
            } else{
                System.out.println("Введите корректное выражение. Пример может содержать только числа и знаки +/*-." +
                        " Так же числа и знаки должны быть отделены пробелом");
                return false;
            }
        }
        return true;
    }
}
