package lesson4;

import java.math.BigDecimal;

public class DataTypes {


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(5.56456456456);
        BigDecimal b = new BigDecimal(3453456456.34569458604586049568059);

        System.out.println(a.add(b));

        // char type


        String s = "Hello";
        char character = 'a';

        char missed = ' ';
        char killed = 'X';


        String str = "ahdfghkfghjldfgjhdfglj";

        System.out.println(str.charAt(3));

        char [] charArray = str.toCharArray();
        System.out.println(charArray[3]);

        byte bt = 127;

        System.out.println("byte initial:" + bt);

        bt = (byte) ((byte) bt+2);
        System.out.println(bt);

        final double pi; // this is a constant


        pi = 3.14;

        byte conversionByte = 30;
        int conversionInt = conversionByte;
        long conversionLong = conversionInt;

        System.out.println(conversionLong);

        double qwe = 2.2;
        int rty = (int)qwe;

        System.out.println(rty);

        int asd = 150;
        byte fgh = (byte) asd;

        System.out.println(fgh);

        System.out.println("x" + "y");

        System.out.println("5" + "5");

        System.out.println("5" + 5);

        System.out.println(5 + "5");

        System.out.println(5 + 5 + "5");

        System.out.println("" + 5 + 5);


        // java.lang.Math

        System.out.println(Math.sqrt(16)); // квадратний корінь
        System.out.println(Math.pow(4, 2)); // піднесення до ступеня
        System.out.println(Math.max(5, 18)); // max value out of 2
        System.out.println(Math.abs(-32)); // модуль
        System.out.println(Math.log10(5)); // логарифм


        // More concepts in loops

        // break; goto; continue;

        for (int i =0; i < 10; i++ ){
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        label:
        for (int i = 0; i < 100; i++) {
            if (i < 40 && i > 20) {
                continue;
            }
            System.out.println("If you are " + i + " years old, you're either young or old");
        }
    }
}
