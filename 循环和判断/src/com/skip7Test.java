package com;

public class skip7Test {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过...
        // 69 过 过 过 ... 80
        //个位7  十位7  7倍数
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

