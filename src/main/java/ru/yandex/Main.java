package ru.yandex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Перед вами простой калькулятор. Введите желаемое действие (+, -, *, /)");
        String action = scanner.nextLine();

        System.out.println("Введите первое число");
        String firstArg = scanner.nextLine();

        System.out.println("Введите второе число");
        String secondArg = scanner.nextLine();

        Double result = calculator.calculate(Double.parseDouble(firstArg), Integer.parseInt(secondArg), action);

        System.out.println("Результат вычислений: " + result);
    }
}
