package com.loopDemo;

import java.util.Scanner;

public class loop_for_count {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围开始：");
        int num1 = sc.nextInt();
        System.out.println("请输入一个数字表示范围结束：");
        int num2 = sc.nextInt();
        for(int i = 1 ; i >= num1 && i <= num2;i++){
            if(i % 3 ==0 && i % 5 == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("在" + num1 + "到" + num2 + "范围中既能被3整除又能被5整除的数有" + count + "个");
    }
}
