package com;

import java.util.Scanner;

public class zhishuTest {
    public static void main(String[] args) {
        // 求质数
        // 只能被1和它本身整除的数
        // 7 = 1 * 7
        // 11 = 1 * 11
        // 17 = 1 * 17
        // 23 = 1 * 23
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();


        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                System.out.println(num + "不是质数");
                break;
            } /*else {
                System.out.println(num + "是质数");
            }*/ //整个循环结束后才可以判断是不是质数，因此可以设置一个标志位
        }if (flag==true){
            System.out.println(num+"是质数");
        }
    }
}
