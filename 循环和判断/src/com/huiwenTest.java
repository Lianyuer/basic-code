package com;

import java.util.Scanner;

public class huiwenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        int num = 0;  //存储倒过来的数
        int temp = x;
        while(x != 0){
            int ge = x % 10;
            num = num * 10 +ge;
            x /= 10;
        }
        if(temp == num){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
