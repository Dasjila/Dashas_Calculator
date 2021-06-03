package com.gorbunkova;

import java.util.HashMap;
import java.util.Map;

public class Converter extends Operation {
    public static void conv() {
        Map<Integer, String> conv = new HashMap<>();
        conv.put(1, "I");
        conv.put(2, "II");
        conv.put(3, "III");
        conv.put(4, "IV");
        conv.put(5, "V");
        conv.put(6, "VI");
        conv.put(7, "VII");
        conv.put(8, "VIII");
        conv.put(9, "IX");
        conv.put(10, "X");

        try {
            int a = result / 10;
            int b = result % 10;
            String c = null;
            String d = null;
            if (conv.containsValue(numb3) && conv.containsValue(numb4) && result > 0) {
                if (a == 1) {c = "X";}
                if (a == 2) {c = "XX";}
                if (a == 3) {c = "XXX";}
                if (a == 4) {c = "XL";}
                if (a == 5) {c = "L";}
                if (a == 6) {c = "LX";}
                if (a == 7) {c = "LXX";}
                if (a == 8) {c = "LXXX";}
                if (a == 9) {c = "XC";}
                if (a == 10) {c = "C";}
                if (b > 0) {d = conv.get(b);}
            }
            if (b == 0 || a == 10) {
                System.out.println(c);
            }
            if (b > 0 && result > 10) {
                System.out.println(c + d);
            }
            if (result == 0) {
                System.out.println("null");
            }
            if (result < 10) {
                System.out.println(d);
            }
            if (result < 0) {
                throw new IllegalArgumentException("В ответе отрицательное число. Отображение невозможно");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(-5);
        }
    }
}

