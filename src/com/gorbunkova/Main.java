package com.gorbunkova;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числовое выражение, используя римские или арабские числа от 1 до 10, через пробел:");
        Operation.scannerr();
        Operation.countOperation();
    }
}