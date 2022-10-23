package com;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class zhishuTest2 {
    public static void main(String[] args) {
        // 100000
        // 2 ~ 99999
        // 循环的次数，将近10w次

        // 推荐一个简化的思路
        // 81
        // 1 * 81
        // 3 * 27
        // 9 * 9

        // 以81的平方根9，为中心
        // 假设 a * b = 81
        // 那么a和b中，其中有一个必定是小于等于9
        // 另一个是大于等于9的

        // 假设，都是大于9 --- 9.1 * 9.1 > 81
        // 假设，都是小于9 --- 8.9 * 8.9 < 81
        // 其中一个数字一定是小于等于平方根
        // 另外一个数字一定是大于等于平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        // 如果这个范围之内，所有数字都不能被num整除
        // 那么num就一定是一个质数
        boolean flag = true;
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                System.out.println(num + "不是质数");
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是质数");
        }
    }
}
