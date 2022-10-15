package com.lianyu.arithmeticoperator;

public class Arithmeticoperator {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(5 - 1);
        System.out.println(7 * 9);

        //有小数参与运算，结果有可能会不精确
        System.out.println(3.2 + 2.1);   // 5.300000000000001
        System.out.println(5 - 1.1);     // 3.9
        System.out.println(7.0 * 9);     // 63.0
    }
}
