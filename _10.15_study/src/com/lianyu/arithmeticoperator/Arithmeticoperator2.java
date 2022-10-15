package com.lianyu.arithmeticoperator;

public class Arithmeticoperator2 {
    //1.整数参与运算结果只能得到整数
    //2.小数参与运算，结果有可能是不精确的
    public static void main(String[] args) {
        System.out.println(10 / 2);  // 5
        System.out.println(10 / 3);  // 3
        System.out.println(10.0 / 3);// 3.3333333333333335

        //取模，取余：做除法运算得到余数
        System.out.println(10 % 2);  // 0
        System.out.println(10 % 3);  // 1

        //应用场景：
        //1.可以用取模来判断，A是否可以被B整除
        //2.可以判断A是否为偶数
        //3.斗地主发牌：轮流给三个玩家发牌
    }
}
