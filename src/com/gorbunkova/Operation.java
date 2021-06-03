package com.gorbunkova;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    public static String numb3 = null;
    public static String sign1 = null;
    public static String numb4 = null;
    public static int num3 = 0;
    public static int num4 = 0;
    public static int num5 = 0;
    public static int num6 = 0;
    public static int result;
    public static HashMap<String, Integer> romans = new HashMap<>();

    public static void scannerr() {
        romans.put("I", 1);
        romans.put("II", 2);
        romans.put("III", 3);
        romans.put("IV", 4);
        romans.put("V", 5);
        romans.put("VI", 6);
        romans.put("VII", 7);
        romans.put("VIII", 8);
        romans.put("IX", 9);
        romans.put("X", 10);

        Scanner scan = new Scanner(System.in);
        try {
            numb3 = scan.next().toUpperCase();
            if (romans.containsKey(numb3)) {
                num3 = romans.get(numb3);
            } else {
                num5 = Integer.parseInt(numb3);
            }
        } catch (InputMismatchException | IllegalArgumentException ex) {
            System.out.println("Выражение введено неверно/Введите знаки через пробел");
            System.exit(-1);
        }
        try {
            sign1 = scan.next();
            if (sign1.length() > 1) {
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e) {
            System.out.println("Неверно введен знак/Введите знаки через пробел");
            System.exit(-2);
        }
        try {
            numb4 = scan.next().toUpperCase();
            if (romans.containsKey(numb4)) {
                num4 = romans.get(numb4);
            } else {
                num6 = Integer.parseInt(numb4);
            }
        }
        catch (InputMismatchException | IllegalArgumentException ex) {
            System.out.println("Ошибка ввода");
            System.exit(-3);
        }
    }

    public static void countOperation() {
        try {
            if (num3 >= 1 && num3 <= 10 && num4 >= 1 && num4 <= 10) {
                switch (sign1) {
                    case "+" -> result = num3 + num4;
                    case "-" -> result = num3 - num4;
                    case "*" -> result = num3 * num4;
                    case "/" -> result = num3 / num4;
                    default -> throw new IllegalArgumentException("Ошибка ввода знака");
                }
            }
            else if (num5 >= 1 && num5 <= 10 && num6 >= 1 && num6 <= 10) {
                switch (sign1) {
                    case "+" -> result = num5 + num6;
                    case "-" -> result = num5 - num6;
                    case "*" -> result = num5 * num6;
                    case "/" -> result = num5 / num6;
                    default -> throw new IllegalArgumentException("Ошибка ввода знака");
                }
            }
            else {
                throw new Exception("Введен неверный диапазон чисел");
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-4);
        }

        if (romans.containsKey(numb3) && romans.containsKey(numb4)) {
            Converter.conv();
        }
        else {
            System.out.println(result);
        }
    }
}

