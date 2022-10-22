package com;

import java.util.Scanner;

public class sqrtTest {
    public static void main(String[] args) {
        /*
        输入一个大于2的整数，求它的平方根，保留到整数
         */
        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        //推断：10的平方根在3~4之间

        // 20
        // 1 * 1 = 1 < 20
        // 2 * 2 = 4 < 20
        // 3 * 3 = 9 < 20
        // 4 * 4 = 16 < 20
        // 5 * 5 = 25 > 20

        //推断：20的平方根在4~5之间

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(num + "的平方根等于" + i);
                break;// 一旦找到了，后面的数字就不用再找了，提高代码运行效率
            } else if (i * i > num) {
                System.out.println(i - 1 + "就是平方根的整数部分");
                break;
            }
        }
    }
}
