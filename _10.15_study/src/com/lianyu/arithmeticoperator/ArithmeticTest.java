package com.lianyu.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位正整数：");
        int num = sc.nextInt();
        int a = num % 10;       //个位
        int b = num / 10 % 10;  //十位
        int c = num / 100 % 10; //百位
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
