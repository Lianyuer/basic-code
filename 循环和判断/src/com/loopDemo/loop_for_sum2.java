package com.loopDemo;

public class loop_for_sum2 {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 1 ; i <= 100 ; i++){
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("1-100的偶数和是：" + sum);
    }
}
